public class Main5 {
    public static void main(String[] args) {
        try{
            Integer a = null;
            Integer b =45;
            System.out.println(a+b);
        } catch (Error error){
            System.out.println(error.getMessage());
        }
    }
}
