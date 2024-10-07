package d17constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {

        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        //Example 1: If the date you have received from the user is in the past, give the message "You have entered an invalid date".
        //If the date you have received from the user is in the future, say "You can enter the time".

        Scanner input = new Scanner(System.in);
        LocalDate givenDate = null; //LocalDate givenDate; de yazabilirdik

        while (true) { //sonsuz dongu yaptik, icerden dongu kirilmadigi surece calisacak

            System.out.println("Lutfen yili giriniz");
            int year = input.nextInt();

            System.out.println("Lutfen ayi giriniz");
            int month = input.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Ay 1 ile 12 arasinda olmalidir. Tekrar deneyiniz");
                continue; //Kullaniciyi dongunun basina yonlendirir
            }

            System.out.println("Lutfen gunu giriniz");
            int day = input.nextInt();

            //Ayin kac cektigini bulalim. Yil ve ay icin YearMonth objesi olusturalim
            YearMonth yearMonth = YearMonth.of(year, month);

            //Ayin maksimum gun sayisini bulalim
            int daysInMonth = yearMonth.lengthOfMonth();

            if (day < 1 || day > daysInMonth) {
                System.out.println("Girilen ay icin gecersiz gun. Tekrar deneyiniz");
                continue; //Kullaniciyi dongunun basina yonlendirir
            }

            givenDate = LocalDate.of(year, month, day); //girilen bilgilerle tarih olusturduk

            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println("Gecersiz, gecmis bir tarih girdiniz. Tekrar deneyiniz");
            } else {
                System.out.println("Zamani girebilirsiniz");
                break; //Gecerli tarih girdiniz, donguden cik
            }


        }
        //break calisirsa buraya gelir, buradan sonra kod varsa, o kodlar calisir.
        //return calistirildiginda, metodun geri kalan kismi yurutulmez ve metottan cikilir.
        //main durmasi programin calismasinin durmasi anlamina gelir.

    }
}