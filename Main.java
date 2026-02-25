import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        System.out.println(hasDuplicate(arr));
    }

    public static boolean hasDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
