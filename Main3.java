import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        //3 basa dusmedim
        int[] arr = {4, 2, 9, 1, 5};

        int minIndex = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minIndex>arr[i]) {
                minIndex=arr[i];
            }
        }
        System.out.println(minIndex);
    }
    }

