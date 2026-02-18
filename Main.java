import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        for (int i = 0; i < 50; i++) {
            if (i%2==0){
                System.out.println(i);
            }
            System.out.println("-------------------------------------------");

            //2
            String[] a = {"sabir","sabir","aga","ad","random","random","aga"};
            //3
            Integer[] b = {1,2,3,4,5,5,6,7,8,9,11,22,44,55,77,233,453,3,45,3,4,48,2,4,5,2,7,4,5,4,45,45,4,2,234,67,4,543};
                for (Integer c : b){
                    if (c%2==0&&c%3==0){
                        System.out.println(c);
                    }
                }
            System.out.println("--------------------------------------------");
                //4 ?
//            Integer[] d = {1,2,3,4,5,5,6,7,8,9,11,22,44,55,77,233,453,3,45,3,4,48,2,4,5,2,7,4,5,4,45,45,4,2,234,67,4,543};
//            for (Integer e:d){
//                if (e>e){
//                    System.out.println(e);
//                }
//            }
            //5
            Integer g = 10;
            for (int j = 0; j < 11; j++) {
                System.out.println(j*g);
            }
            System.out.println("-----------------------------");
            //6
            for (int j = 0; j < 11; j++) {
                System.out.println(j*j);
            }
            System.out.println("-----------------------------------");
            //7 ?
            //8 ?

        }
    }
}
