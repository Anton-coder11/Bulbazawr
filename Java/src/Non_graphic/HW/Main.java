package Non_graphic.HW;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        findMax(list);
    }

    public static void findMax(ArrayList<Integer> array){
        int max = array.get(0);
        for (int i=0;i <array.size();i++){
            if (max<array.get(i)){
                max = array.get(i);
            }
        }
        System.out.print(max);
    }
}
