package Dao;

import Model.Cart;
import Model.Menu;
import Model.Music;
import org.sql2o.Query;

import java.util.List;

public interface Dao {

    public List<Menu> getAllMenus();

    public List<Music> getAllMusics();

    public void insertCart(String cartmenuname, String cartmenuimg, Double cartmenuprice);

    public List<Cart> getAllCartItems();

    public List<Cart> getCountedCartItems();

    public void deleteItem(String cartmenuname);

    public void deleteAllItem();

    public List<Cart> getSumPrices();
}
