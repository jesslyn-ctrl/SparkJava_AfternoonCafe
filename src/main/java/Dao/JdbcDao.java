package Dao;

import Model.Cart;
import Model.Menu;
import Model.Music;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class JdbcDao implements Dao{
    private static Sql2o db;

    static{
        db = new Sql2o("jdbc:mysql://localhost:3306/afternoon_cafe", "root", "");
    }

    @Override
    public List<Menu> getAllMenus() {
        String sql = "SELECT * FROM menu";
        try(Connection con = db.open()){
            return con.createQuery(sql).executeAndFetch(Menu.class);
        }
    }

    @Override
    public List<Music> getAllMusics() {
        String sql = "SELECT * FROM music";
        try(Connection con = db.open()){
            return con.createQuery(sql).executeAndFetch(Music.class);
        }
    }

    @Override
    public void insertCart(String cartmenuname, String cartmenuimg, Double cartmenuprice) {
        String sql = "INSERT INTO Cart(cartmenuname, cartmenuimg, cartmenuprice) " +
                     "VALUES(:cartmenuname, :cartmenuimg, :cartmenuprice)";
        try(Connection con = db.open()){
            con.createQuery(sql)
                    .addParameter("cartmenuname", cartmenuname)
                    .addParameter("cartmenuimg", cartmenuimg)
                    .addParameter("cartmenuprice", cartmenuprice)
                    .executeUpdate();
        }
    }

    @Override
    public List<Cart> getAllCartItems() {
        String sql = "SELECT * FROM cart";
        try(Connection con = db.open()){
            return con.createQuery(sql).executeAndFetch(Cart.class);
        }
    }

    @Override
    public List<Cart> getCountedCartItems() {
        String sql = "SELECT cartmenuname, cartmenuimg, cartmenuprice, count(*) \"count\", cartmenuprice*count(*) \"countnprice\"" +
                     "FROM cart GROUP BY cartmenuname";
        try(Connection con = db.open()){
            return con.createQuery(sql).executeAndFetch(Cart.class);
        }
    }

    @Override
    public void deleteItem(String cartmenuname) {
        String sql = "DELETE FROM cart " +
                     "WHERE cartmenuname = :cartmenuname";
        try(Connection con = db.open()){
            con.createQuery(sql)
                    .addParameter("cartmenuname", cartmenuname)
                    .executeUpdate();
        }
    }

    @Override
    public void deleteAllItem() {
        String sql = "DELETE FROM cart";
        try(Connection con = db.open()){
            con.createQuery(sql)
                    .executeUpdate();
        }
    }

    @Override
    public List<Cart> getSumPrices() {
        String sql = "SELECT SUM(cartmenuprice) \"sumPrices\", " +
                     "SUM(cartmenuprice)*0.1 \"taxes\", " +
                     "SUM(cartmenuprice)+SUM(cartmenuprice)*0.1 \"total\" " +
                     "FROM cart";
        try(Connection con = db.open()){
            return con.createQuery(sql).executeAndFetch(Cart.class);
        }
    }

}
