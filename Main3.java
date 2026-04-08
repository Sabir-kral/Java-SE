public class Main3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 11;
        try {
            System.out.println(arr[index]);
        } catch (Error error){
            System.out.println(error.getMessage());
        }
    }
}