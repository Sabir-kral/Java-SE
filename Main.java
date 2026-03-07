import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        int sum = max1 + max2;
        System.out.println(sum);
        System.out.println("----------------------");
        //2 ?
        //3
        String str = "Java proqramlasdirma dilidir   ";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println( count);
        System.out.println("---------------------------------");
        //4
        String str2 = "Java Programming Language";

        int count2 = 0;

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (Character.isUpperCase(ch)) {
                count2++;
            }
        }
        System.out.println(count2);
        System.out.println("-------------------------");
        //5
        Set<Integer> set = new HashSet<>();
        int[] arr2 = {9,1,2,4,5};
        for (int a :arr2){

            set.add(a*2);
        }
        System.out.println(set);

    }

}
