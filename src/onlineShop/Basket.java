package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Product> products = new ArrayList<>();
    float totalPrice = 0;

    public float getTotalPrice() {
        return totalPrice;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }


    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void showProducts() {
        for (Product product : products
        ) {
            System.out.println(product.gettitle() + " " + product.getprice());
        }


    }

    public void showTotalPrice() {

        for (Product browseProduct : products
        ) {
            this.totalPrice += browseProduct.getprice();
        }
        System.out.println(this.totalPrice);
    }
}
