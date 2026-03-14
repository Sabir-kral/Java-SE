package lesson82.task;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int a:arr){
            if (a%2==1||a==2){
                sum+=a;
            }
        }
        System.out.println(sum);
        //2
        String text = "Java proqramlasdirma dilini oyrenirem";

        String[] words = text.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
        //3
        String text1 = "Java proqramlasdirma dilini oyrenirem";
        int num = 0;
        for (int i = 0; i < text1.length(); i++) {
            char c = Character.toLowerCase(text1.charAt(i));

            if (c=='a' || c=='e' || c=='ə' || c=='i' || c=='ı' ||
                    c=='o' || c=='ö' || c=='u' || c=='ü') {
                num++;
            }
        }
        System.out.println(num);
        //4 ?

        }
    }

