import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1) 1-dən 100-ə qədər cüt ədədlər
        System.out.println("1-dən 100-ə qədər cüt ədədlər:");
        for(int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        // 2) Vurma cədvəli
        System.out.println("\n\nVurma cədvəli:");
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i*j) + "\t");
            }
            System.out.println();
        }

        // 3) Kvadratlar
        System.out.println("\n1-dən 10-a qədər kvadratlar:");
        for(int i = 1; i <= 10; i++) {
            System.out.print((i*i) + " ");
        }

        // 4) Üçbucaq
        System.out.println("\n\nÜçbucaq:");
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 5) While ilə 1-dən 20-yə qədər
        System.out.println("\n1-dən 20-yə qədər ədədlər:");
        int k = 1;
        while(k <= 20) {
            System.out.print(k + " ");
            k++;
        }

        Scanner sc = new Scanner(System.in);

        // 6) Ədədin tərsi
        System.out.print("\n\nƏdəd daxil et: ");
        int n = sc.nextInt();
        int reversed = 0;

        while(n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Tərsi: " + reversed);

        // 7) 0 daxil edilənə qədər cəm
        int num, sum = 0;
        System.out.println("\n0 daxil edənə qədər ədədləri daxil et:");

        do {
            num = sc.nextInt();
            sum += num;
        } while(num != 0);

        System.out.println("Cəm: " + sum);

        sc.close();
    }
}