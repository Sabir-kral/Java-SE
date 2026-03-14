package lesson82;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Adinizi yazin");
        String name = sc.nextLine();
        System.out.println("adiniz: "+name.length()+" "+"simvol uzunluqundadir");
        //2
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Adinizi yazin");
        String name1 = sc1.nextLine();
        System.out.println("soyadinizi yazin");
        String surname = sc1.nextLine();
        System.out.println("adiniz soyadiniz: "+name1+" "+surname);
        //3
        Scanner sc2 = new Scanner(System.in);
        System.out.println("nese yazin: ");
        String str = sc2.nextLine();
        System.out.println(str.charAt(3));
        //4
        Scanner sc3 = new Scanner(System.in);
        System.out.println("gmail yaz");
        String gmail = sc3.nextLine();
        System.out.println(gmail.endsWith("@gmail.com"));
        //5
        String parol1 = "sabir123";
        String parol2 = "sabir123";
        System.out.println(parol1.matches(parol2));
        //6
        String str2 = "Java guclu programlama dilidir";
        System.out.println(str2.indexOf("a", 0));
        //7
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sey yaz: ");
        String something = scanner.nextLine();
        System.out.println(something.isEmpty());
        //8
        String cumle = "        Java guclu programlama dilidir       ";
        System.out.println(cumle.replaceAll(" ", "-"));
        //9
        Scanner scc = new Scanner(System.in);
        System.out.println("tam ad ve soyad yaz");
        String nameSurname = scc.nextLine();
        String[] parts = nameSurname.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
         }
            //10
            Scanner sccc = new Scanner(System.in);
            System.out.println("nomre yaz");
            String number = sccc.nextLine();
            System.out.println(number.startsWith("+994"));
            //11 ?
            //12
            String str3 = "Java guclu programlama dilidir";
            System.out.println("Boyuk: " + str3.toUpperCase());
            System.out.println("kicik: " + str3.toLowerCase());
            //13
            System.out.println(str3.contains("Java"));
            //14
            String cumle2 = "        Java guclu programlama dilidir       ";
            System.out.println(cumle2.trim());
        }
    }

