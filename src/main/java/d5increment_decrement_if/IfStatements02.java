package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
        //Example 1: Create the code that prints whether a number received from the user is odd or even.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int num = input.nextInt();

        //-----------1.yol:
        if (num % 2 == 0) {
            System.out.println("Cift sayi");
        }

        if (num % 2 != 0) { //num % 2 == 1; de yazabilirdik
            System.out.println("Tek sayi");
        }
        //-----------2.yol:
        if (num % 2 == 0) {
            System.out.println("Sayi cifttir");
        } else {
            System.out.println("Sayi tektir");
        }


    }
}