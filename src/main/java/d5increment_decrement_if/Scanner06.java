package d5increment_decrement_if;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        /*Ornek 6: Yeni Satir Karakteri ('\n') Hatasi: Ardışık olarak birden fazla Scanner objesiyle bilgi
        toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
        Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
        kullanırken yaygın olarak karşılaşılır.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int age = scanner.nextInt();// sayısal bir input aldık

        scanner.nextLine(); // kullanılmayan yeni satır karakterini okuyup atlar


        System.out.println("Adınızı giriniz");
        String name = scanner.nextLine();// çalıştırınca bu satır atlanacak

        /*Ornek 6: Yeni Satir Karakteri ('\n') Hatasi: Ardışık olarak birden fazla Scanner objesiyle bilgi
        toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
        Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
        kullanırken yaygın olarak karşılaşılır.*/

        /*Bu sorunu çözmenin yaygın bir yolu, sayısal girdi aldıktan sonra bir nextLine() çağrısı
        ekleyerek kalan yeni satır karakterini temizlemektir*/

        // ARAŞTIRMA ÖDEVİ: YENİ SATIR KARAKTERİ (' \n' ) hatasını düzeltmenin yolu var mı ?










    }
}
