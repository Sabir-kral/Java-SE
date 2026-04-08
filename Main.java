public class Main {
    public static void main(String[] args) {
        try {
            int num = 5;
            System.out.println(num/0);
        } catch (Error error){
            System.out.println(error.getMessage());
        }
    }
}
