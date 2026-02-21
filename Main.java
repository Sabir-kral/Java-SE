import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Integer[] list = {1,3,-3,0,-3,2,-5,4,0,-3,-2};
        for (Integer b:list){
            if (b<0){
                System.out.println(b);
            }
        }
        System.out.println("---------------------------------");
        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir reqem yaz");
        Integer number = scanner.nextInt();

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("factorial:"+number+"="+fact);
        //3
        Integer[] array = {1,3,3,0,3,2,5,4,0,3,2};
        for (Integer b:array){
            if (b%2==1){
                System.out.println(b+b);
            }
        }
        System.out.println("---------------------------------------");
        //4
       Scanner sc = new Scanner(System.in);
        System.out.println("bir reqem yaz");
        Integer num = sc.nextInt();
        if(num%2==0&&num%num==0){
            System.out.println("sade deyil");
        } else {
            System.out.println("sadedir");
        }
        //5?
    }
}
