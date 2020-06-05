package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products;
        products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Meat", 4);
        products[4] = new Product("Fish", 13);


        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        delete(products, 3);

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }

        }
    }


    public static void delete(Product[] products, int index) {

        if (products.length - 1 - index >= 0)
            System.arraycopy(products, index + 1, products, index, products.length - 1 - index);
        products[products.length - 1] = null;
    }
}








