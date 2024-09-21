package d6if_switch;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis*/

        /*Example 1: Create the code that takes the age value from the user and prints the stage of age according to the following table.

        0-4 (inclusive) ==> baby
        5-12 (inclusive)==>child
        13-20 (inclusive) ==> young
        21-30 (inclusive) ==> adult
        Over 30 ==> Undefined*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınzı giriniz:");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Geçeli bir yaş giriniz");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31) {
            System.out.println("Yetıskin");
        } else {
            System.out.println("Tanımlanmamıs yas");
        }



    }
}
