package Model;

import lombok.Getter;

public class Cart {
    @Getter private Integer cartid;
    @Getter private String cartmenuname;
    @Getter private String cartmenuimg;
    @Getter private  Double cartmenuprice;
    @Getter private Integer count;
    @Getter private Double countnprice;
    @Getter private Double sumPrices;
    @Getter private Double taxes;
    @Getter private Double total;

    public Cart(Integer cartid, String cartmenuname, String cartmenuimg, Double cartmenuprice, Integer count, Double countnprice, Double sumPrices, Double taxes, Double total){
        this.cartid = cartid;
        this.cartmenuname = cartmenuname;
        this.cartmenuimg = cartmenuimg;
        this.cartmenuprice = cartmenuprice;
        this.count = count;
        this.countnprice = countnprice;
        this.sumPrices = sumPrices;
        this.taxes = taxes;
        this.total = total;
    }
}
