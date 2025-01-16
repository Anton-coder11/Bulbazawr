package Non_graphic.HW.HW9.second;


import java.util.ArrayList;

public class Store {

    static ArrayList<String> totalProducts = new ArrayList<>();
    static ArrayList<Integer> prices = new ArrayList<>();
    public static void addProduct(Product product){
        if (product != null) {
            totalProducts.add(product.name);
            prices.add(product.price);
            System.out.println("Продукт додан: " + product.name);
        } else {
            System.out.println("Неможливо додати продукт");
        }


        System.out.println("|----------------------------------------|");

    }
    public static void showProducts() {
        System.out.println("Showing all availabe products");
        for (int i =0; i < totalProducts.size(); i++) {
            System.out.println(i+1 + ") " +totalProducts.get(i) +" "+ prices.get(i) + "$");
        }
        System.out.println("|----------------------------------------|");
    }
}

