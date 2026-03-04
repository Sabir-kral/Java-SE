import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        int[] arr = {4, 2, 3, 1, 5};

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }

}
