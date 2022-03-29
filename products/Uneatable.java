package products;

public class Uneatable extends Product {

    private String destination;

    public Uneatable(String prodName, String destination, float price) {
        super(prodName, price);
        this.prodName = prodName;
        this.destination = destination;
        this.price = price;
    }

    public float getPrice(){
        return price;
    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
