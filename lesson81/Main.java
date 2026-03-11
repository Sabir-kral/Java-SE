package lesson81;

public class Main {
    public static void main(String[] args) {
        //1
        String name = "Cavid";
        System.out.println(name);
        //2
        String message = "Java dili güclü və effektli bir proqramlaşdırma dilidir";
        System.out.println(message);
        //3
        System.out.println(message.length());
        //4
        System.out.println(message.charAt(1));
        //5
        System.out.println(message.indexOf('i'));
        //6
        System.out.println(message.toLowerCase());
        //7
        System.out.println(message.toUpperCase());
        //8
        System.out.println(message.isBlank());
        //9
        System.out.println(message.isEmpty());
        //10
        System.out.println(message.isEmpty());
        //11
        name = "   Adil    ";
        System.out.println(name);
        //12
        System.out.println(name.trim());
        //13
        name = "Bəxtiyar";
        //14

        System.out.println(name.substring(0,4));
        System.out.println("---------------------------");
        //15
        name = "Əli Həsənov";
        //16
        String[] massiv = name.split(" ");
        //17
        for (String a:massiv){
            System.out.println(a);
        }
        System.out.println("-------------------------------");
        //ders praktikasi 2 ni basa dusmedim





    }
}
