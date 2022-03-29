import products.Product;
import products.Eatable;
import products.Uneatable;

public class Storage {

    private boolean prodExists; //Реализация?
    private Product product;
    Eatable sugar;
    Uneatable teapot;
    public String sklad;
    private String state;


    public Storage(String sklad) {
        this.sklad = sklad;
        sugar = new Eatable("Сахар", "16.03.2023", 80);
        teapot = new Uneatable("Чайник", "Греть воду", 2000);
    }
    public void setState(String state) {
        this.state = state;
        System.out.println("Товар " + sugar.prodName + " " + state);
        System.out.println("Товар " + teapot.prodName + " " + state);
    }

    public String getState() {
        return state;
    }


    /* public boolean isProdExists() {
        return prodExists;
    }

    public void setProdExists(boolean prodExists) {
        this.prodExists = prodExists;
    }

*/
}
