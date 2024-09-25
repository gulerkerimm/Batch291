package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0-100 arasinda rastgele bir sayi uretelim
        int rastgeleSayi = random.nextInt(101);

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim.
        int tahminEdilen; //int tahminEdilen = ""; calisir miydi?

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir
        //boolean degisken olusturalim
        boolean tahminDogrumu = false;

        System.out.println("0-100 arasinda br sayiyi tahmin etmeye calisin");

        do {

            //Kullanicdan bir tahmin alalim
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();

            //Sayaci bir artiralim
            denemeSayisi++;

            //Tahmini kontrol edelim
            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayi daha buyuk");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayi daha kucuk");
            } else {
                tahminDogrumu = true;
                System.out.println("Tebrikler, dogru tahmin!");
                System.out.println("Deneme sayisi : " + denemeSayisi);
            }


        } while (!tahminDogrumu); //Dongu dogru tahmin yapincaya kadar devam edecek
        scanner.close(); //Random'da kapatiliyor mu?
        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?
    }
}