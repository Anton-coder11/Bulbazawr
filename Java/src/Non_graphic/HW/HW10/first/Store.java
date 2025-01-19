package Non_graphic.HW.HW10.first;
import java.util.ArrayList;


public class Store {
    private String name;
    static ArrayList<Product> products = new ArrayList<>();


    public Store(String name) {
        this.name = name;
    }

    public static void addProduct(Product product) {
        System.out.println("|---------------------------------------|");
        if (product != null) {
            products.add(product);
            System.out.println("Продукт додан: " + product.getName());
            System.out.println("Ціна продукта: " + product.getPrice()+"$");
            System.out.println("ID продукта: " + product.getId());
        } else {
            System.out.println("Неможливо додати продукта");
        }

    }

    public static void removeProduct(int productId) {

        String name = "";
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productId) {
                name = products.get(i).getName();
                products.remove(i);
                break;
            }
        }
        System.out.println("Продукт: " + name + " було видалено");
    }

    public static void  listProducts(){
        System.out.println("|---------------------------------------|");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Продукт: " + products.get(i).getName());
            System.out.println("Ціна: " + products.get(i).getPrice()+"$");
            System.out.println("ID: " + products.get(i).getId());
            System.out.println("|---------------------------------------|");
        }

    }
}