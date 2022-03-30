import java.util.Objects;

public class Payment {

    private String payType;
    private float paySum;
    private Basket basket;
    private Client alyosha;

    Payment(String payType) {
        this.payType = payType;
    }

    public void getToPay(Storage s) {
        if (Objects.equals(s.getState(), "в корзине")) {
            s.setState("ждёт оплату");
        }
    }

    public void setPaySum(Storage s) {
        paySum = s.sugar.price + s.teapot.price;
        System.out.println("К оплате " + getPaySum());
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void wasPayed(Client alyosha, Storage s) {
        if(Objects.equals(getPayType(), "безналичная") && alyosha.getMoney() >= getPaySum()) {
            s.setState("оплачен");
            alyosha.setMoney(alyosha.getMoney() - getPaySum());
            System.out.println("На счету " + alyosha + " осталось " + alyosha.getMoney() + "р");
        }
        else if(Objects.equals(getPayType(), "наличная")) {
            s.setState("оплата по факту доставки");
        }
        else {
            System.out.println("Не хватает средств");
            System.exit(0); //Вернуть в начало?
            }
    }
    public String getPayType() {
        return payType;
    }

    public float getPaySum() {
        return paySum;
    }

}
