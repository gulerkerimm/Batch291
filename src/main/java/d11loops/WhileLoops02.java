 package d11loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {

        /*Ornek 1:  Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a
        yazdiran kodu yaziniz.

         Example 1: Write the code that creates the multiplication table for the
         number given by the user and writes it to the console.

        3 ==> 3x1=3
              3x2=6
              3x3=9
              3x4=12 …
              3x10=30*/

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int num = input.nextInt();

        int i = 1;


        while (i < 11) {
            System.out.println(num + "x" + i + " = " + (num * i));


            i++;
        }


    }
}