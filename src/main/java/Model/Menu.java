package Model;

import lombok.Getter;

public class Menu {
    @Getter private Integer menuid;
    @Getter private String menuname;
    @Getter private String menuimg;
    @Getter private String menudesc;
    @Getter private  Double price;

    public Menu(Integer menuid, String menuname, String menuimg, String menudesc, Double price){
        super();
        this.menuid = menuid;
        this.menuname = menuname;
        this.menuimg = menuimg;
        this.menudesc = menudesc;
        this.price = price;
    }
}
