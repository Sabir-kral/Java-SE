public class Main5 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5};
        int max = arr[0];

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
