import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2,3,7};

        int length = arr1.length;


        int[] arr2 = new int[length];


        for (int i = 0; i < length; i++) {
            arr2[i] = i;
        }


        for (int i = 0; i < length; i++) {

        }



        for (int i = 0; i < arr1.length; i++) {
            boolean tapildi = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    tapildi = true;
                    break;
                }
            }

            if (!tapildi) {
                System.out.println(arr1[i]);
            }
        }
    }


}
