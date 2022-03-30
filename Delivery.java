public class Delivery {

    private String deliveryDate;
    private String deliveryAddress;

    public Delivery(String deliveryDate, String deliveryAddress) {
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
    }
    public void getToDelivery(Storage s) {
        s.setState("передан в доставку");
    }
    public void orderDelivered(Client alyosha, Storage s) {
        s.setState("доставлен клиенту " + alyosha);
        System.out.println("По адресу: " + deliveryAddress + "; " + deliveryDate);
    }
}
