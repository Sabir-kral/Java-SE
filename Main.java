import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 5, 0, 3, 8, 0, 1};

        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] moveZerosToEnd(int[] arr) {
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }


        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

return new int[]{} ;
    }
}
