import products.Product;

import java.util.Objects;

public class Basket {

    private Product product;

    public void putInBasket(Storage s) {
        if (Objects.equals(s.getState(), "в наличии")) {
            s.setState("в корзине");
        } else System.out.println("Товара нет в наличии");
    }
}