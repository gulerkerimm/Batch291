package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        //Example 5: The first two and last two digits of a 5-digit number you will receive from the user.
        //Write the code that prints the sum of the numbers
        //           45678 ==> 45 + 78 = 123

        Scanner input   = new Scanner(System.in);

        System.out.println("Lütfen beş basamaklı bir sayı giriniz");
        int num = input.nextInt();

        int firstTwoDigits = num / 1000 ;
        int lasrTwoDigits = num % 100 ;


        System.out.println(firstTwoDigits+lasrTwoDigits);










    }
}
