public class Main2 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 5};

        int cut = 0;
        int tek = 0;
        for (int a:arr){
            if (a%2==0){
                cut++;
            }else {
                tek++;
            }

        }
        System.out.println("tek:"+tek);
        System.out.println("cut:"+cut);
    }
}
