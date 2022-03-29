import java.util.Objects;

public class Payment {

    private String payType;
    private String paySum;
    private String payState;
    private Basket basket;
    private Client fedor;

    Payment(String payType) {
        this.payType = payType;
    }

    public void getToPay(Storage s) {
        if (Objects.equals(s.getState(), "в корзине")) {
            s.setState("ждёт оплату");
        }
    }
    public void wasPayed(Client fedor, Storage s) {
        if(fedor.getMoney() >= s.sugar.price+s.teapot.price) {
            s.setState("оплачен");}
        else {
            System.out.println("Не хватает средств");
            System.exit(0); //Вернуть в начало?
            }
    }
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPaySum() {
        return paySum;
    }

    public void setPaySum(String paySum) {
        this.paySum = paySum;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }


}
