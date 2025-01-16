package Non_graphic.HW.HW10.first;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop",555,0001);
        Product product2 = new Product("TV",1250,0002);
        Product product3 = new Product("Washing Machine", 2400, 0003);
        Customer David = new Customer("David");
        Customer Enric = new Customer("Enric");
        Store.addProduct(product1);
        Store.addProduct(product2);
        Store.addProduct(product3);
        David.addToCart(product2);
        David.addToCart(product1);
        Enric.addToCart(product3);
        Enric.addToCart(product1);

        Enric.removeFromCart(0001);
        David.checkout();
        Enric.checkout();
        Store.listProducts();
        Store.removeProduct(0002);
    }
}
