import products.Eatable;
import products.Uneatable;

public class Client {

    private String name;
    private float money;

    public Client(String name, float money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void chooseProduct(Eatable sugar) {
        System.out.println(name + " выбрал " + sugar.prodName);
    }

    public void chooseProduct(Uneatable teapot) {
        System.out.println(name + " выбрал " + teapot.prodName);
    }
}