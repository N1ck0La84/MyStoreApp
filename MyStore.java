import java.util.Objects;

public class MyStore {
    public static void main(String[] args) {

        Client alyosha = new Client("Алёша", 3000);
        Storage storage = new Storage("склад");
        Payment payment = new Payment("безналичная");
        Basket basket = new Basket();
        Delivery delivery = new Delivery("01.04.2022", "ул. Хрустальногорская, 87, кв. 341");
        alyosha.chooseProduct(storage.sugar);
        alyosha.chooseProduct(storage.teapot);
        storage.setState("в наличии");
        basket.putInBasket(storage);
        payment.getToPay(storage);
        payment.setPaySum(storage);
        System.out.println(payment.getPayType() + " оплата");
        payment.wasPayed(alyosha, storage);
        delivery.getToDelivery(storage);
        delivery.orderDelivered(alyosha, storage);
        if (Objects.equals(payment.getPayType(), "наличная")) {
            storage.setState("оплачен наличными");
        }
    }
}

