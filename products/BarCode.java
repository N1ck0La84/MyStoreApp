package products;

public class BarCode {

    private String id;
    private float prodPrice;

      public BarCode(String id, float prodPrice) {
        this.id = id;
        this.prodPrice = prodPrice;
    }

    public String getId() {

        return id;
    }

    public float getProdPrice() {

        return prodPrice;
    }

    public void setProdPrice(float prodPrice) {
                this.prodPrice = prodPrice;
    }


}
