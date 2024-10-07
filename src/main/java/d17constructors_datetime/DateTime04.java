package d17constructors_datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime04 {
    public static void main(String[] args) {

        //ornek 1:  Kullanicidan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        //example 1: Write the code that takes the date of birth from the user and finds the day name of the date entered.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen verilen sirada dogum tarihi bilgisini alt alta giriniz. yil-ay-gun");

        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());

    }
}