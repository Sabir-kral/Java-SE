public class Main4 {
    public static void main(String[] args) {
        try {
            String str = "salam";
            int index = 66;
            System.out.println(str.charAt(index));
        } catch (Error error){
            System.out.println(error.getMessage());
        }
    }
}
