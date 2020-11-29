import App.Path;
import Service.Controller;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        //localhost:7299
        port(7299);
        staticFileLocation("assets");

        //Redirect
        get(Path.Web.REDIRECT, Controller.redirectPage);
        post(Path.Web.ITEM_DELETE_ALL_HOME, Controller.handleDeleteAllItemGoToHome);

        //Home
        get(Path.Web.HOME, Controller.homePage);

        //Menu
        get(Path.Web.MENU, Controller.menuPage);
        post(Path.Web.MENU, Controller.handleAddtoCart);
        post(Path.Web.ITEM_DELETE, Controller.handleDeleteItem);
        post(Path.Web.ITEM_DELETE_ALL, Controller.handleDeleteAllItem);

        //Music
        get(Path.Web.MUSIC, Controller.musicPage);

        //About
        get(Path.Web.ABOUT, Controller.aboutPage);
    }
}
