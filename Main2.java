public class Main2 {
    public static void main(String[] args) {
        try {
            String str = "sabir";
            int a = Integer.parseInt(str);
            System.out.println(a);
        }catch (Error error){
            System.out.println(error.getMessage());
        }
    }
}
