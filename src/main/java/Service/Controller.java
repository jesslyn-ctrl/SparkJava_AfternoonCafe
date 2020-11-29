package Service;

import App.Path;
import App.View;
import Dao.JdbcDao;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private static JdbcDao dao = new JdbcDao();

    public static Route redirectPage = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("cartList", dao.getCountedCartItems());
        return  View.render(req, model, Path.Template.REDIRECT);
    };

    public static Route handleDeleteAllItemGoToHome = (Request req, Response res) ->{
        dao.deleteAllItem();
        res.redirect(Path.Web.HOME);
        return null;
    };

    public static Route homePage = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        return  View.render(req, model, Path.Template.HOME);
    };

    public static Route menuPage = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("menuList", dao.getAllMenus());
        model.put("count", dao.getAllCartItems().size());
        model.put("cartList", dao.getCountedCartItems());
        model.put("sumPrices", dao.getSumPrices());

        return  View.render(req, model, Path.Template.MENU);
    };

    public static Route musicPage = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("musicList", dao.getAllMusics());
        return  View.render(req, model, Path.Template.MUSIC);
    };

    public static Route aboutPage = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        return  View.render(req, model, Path.Template.ABOUT);
    };

    public static Route handleAddtoCart = (Request req, Response res) -> {
        String menu_name = req.queryParams("menu_name");
        String menu_img = req.queryParams("menu_img");
        Double menu_price = Double.parseDouble(req.queryParams("menu_price"));

        dao.insertCart(menu_name, menu_img, menu_price);

        res.redirect(Path.Web.MENU);
        return null;
    };

    public static Route handleDeleteItem = (Request req, Response res) ->{
        String name = req.queryParams("getItemName");

        dao.deleteItem(name);

        res.redirect(Path.Web.MENU);
        return null;
    };

    public static Route handleDeleteAllItem = (Request req, Response res) ->{
        dao.deleteAllItem();
        res.redirect(Path.Web.MENU);
        return null;
    };

}
