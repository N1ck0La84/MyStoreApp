public class MyStore {
    public static void main(String[] args) {

        Client fedor = new Client("Алёша", 3000);
        Storage storage = new Storage("склад");
        Payment payment = new Payment("Безналичная"); //Наличная оплата?
        Basket basket = new Basket();
        Delivery delivery = new Delivery("01.04.2022", "ул. Хрустальногорская, 87, кв. 341");
        fedor.chooseProduct(storage.sugar);
        fedor.chooseProduct(storage.teapot);
        storage.setState("в наличии");
        basket.putInBasket(storage);
        payment.getToPay(storage);
        System.out.println(payment.getPayType() + " оплата");
        payment.wasPayed(fedor, storage);
        delivery.getToDelivery(storage);
        delivery.orderDelivered(fedor, storage);
    }
}

