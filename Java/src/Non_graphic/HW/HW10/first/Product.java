package Non_graphic.HW.HW10.first;

public class Product {
   private int id;
   private String name;
   private double price;

    public Product(String name,double price , int id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

}
