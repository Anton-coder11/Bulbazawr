public class L6 {


    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial (int a){
        int number = a;
        int i1= 1;
        for (int i = 0; i>0; i--) {
            i1 = number * (number - 1);
        }
        return i1;
    }
}
