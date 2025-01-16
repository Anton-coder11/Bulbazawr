package Non_graphic.HW.HW9.second;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Table",100);
        Product product2 = new Product("PC",2000);
        Store.addProduct(product1);
        Store.addProduct(product2);
        Store.showProducts();
;

    }
}
