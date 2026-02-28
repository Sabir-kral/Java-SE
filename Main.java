import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 ?
        //2

        int[] arr = {0, 5, 3, 8,1};
        int[] arr2 = {3, 8, 0, 1};
        Set<Integer> arr3 = new HashSet<>();

        for (int a :arr ){
            for (int b:arr2){
                if (b==a){
                        arr3.add(b);


                }

            }
        }
        System.out.println(arr3);
            //3
                Integer[] massiv = {1,5,2,3};
                Integer[] massiv2 = {5,4,7,6};
                Set<Integer> massiv3 = new HashSet<>();
                Arrays.sort(massiv);
                Arrays.sort(massiv2);
                for (Integer a:massiv){
                    for (Integer b:massiv2){
                        massiv3.add(a);
                        massiv3.add(b);
                    }
                }

        System.out.println(massiv3);
        //4 ?
        //5 ?


    }

}
