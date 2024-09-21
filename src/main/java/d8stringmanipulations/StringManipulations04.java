package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        //Example 1: Find the total price of the following products.
        //String tv = "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice); //1332.98

        //-------------------------
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali   cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String'deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String'i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna "method chain (zincir)" denir

        String name = "   ali   cAN   ";
                                            //ALİ   CAN
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A

        char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println(last); //C

        System.out.println("" +first + last); //AC

        // \\s+ ifadesi, bir veya daha fazla ardışık boşluk karakterini ifade eder.






    }
}