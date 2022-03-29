package products;

public class Eatable extends Product{

    private String shelfLife;

    public Eatable(String prodName, String shelfLife, float price){
        super(prodName, price);
        this.prodName = prodName;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public String getShelfLife() {
        return shelfLife;
    }



}
