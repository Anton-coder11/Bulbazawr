package Non_graphic.HW.HW10.first;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Product> cart = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }
    public void addToCart(Product product){
        System.out.println("|---------------------------------------|");
        cart.add(product);
        System.out.println("Продукт :" + product.getName() + " було додано до тележки кліента " + name);
    }
    public void removeFromCart(int productId){
        System.out.println("|---------------------------------------|");
        String nameOfProduct ="";
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getId() == productId) {
                nameOfProduct= cart.get(i).getName();
                cart.remove(i);
                break;
            }
        }
        System.out.println("Продукт: " + nameOfProduct + " було видалено з тележки кліента " + name);
    }
    public void checkout(){
        System.out.println("|---------------------------------------|");
        int totalPrice = 0;
        for (int i = 0; i < cart.size(); i++) {
            totalPrice += cart.get(i).getPrice();
        }
        System.out.println(totalPrice+ "$");
    }
}
