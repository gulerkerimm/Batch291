package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {

        /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
        1==> Pazar, 2 ==> Pazartesi …*

        //*Example 1: When you receive the number of days from the user, write the code that writes the day name
        1==> Sunday, 2 ==> Monday …*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");

        double numDouble = input.nextDouble();

        int num =(int) numDouble;// type casting yaptık

        if(numDouble !=num){
            System.out.println("Lütfen bir tamsayı giriniz");
        }else{

            if (num <=0) {// num <1 1 den yazabilirdik
                System.out.println("gün sayıları birden küçük olamaz");
            } else if (num==1) {
                System.out.println("pazar");
            } else if (num==2) {
                System.out.println("pazartesi");
            } else if (num==3) {
                System.out.println("salı");
            } else if (num==4) {
                System.out.println("çarşamba");
            } else if (num==5) {
                System.out.println("perşembe");
            } else if (num==6) {
                System.out.println("cuma");
            } else if (num==7) {
                System.out.println("cumartesi");
            } else {
                System.out.println("gün sayıları 7 den büyük olamaz");

            }

        }


    }
}
