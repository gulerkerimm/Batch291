package d9string_loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Döngüler (Loops) tekrar eden kodlama işlerini kolaylaştırmak için kullanılır.

        //Tüm kod parçalarını belirli bir kural döngüsü içinde tekrarlamak için kullanılır.

        //-----------------------
        /*Java'da su donguleri gorecegiz

        1. for-loop
        2. while-loop
        3. do-while-loop
        4. for-each-loop (Collections'larda)*/
        //-----------------------
        /*1. for-loop

        for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak
        için kullanılan bir döngüdür.
        Döngü başlangıcında kullanılan değişkene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.

        for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır.
        Bazi durumlarda döngü sonsuz sayıda yinelenir*/

        //ornek 1: Console'a 4 kere 'Hi!' yazdirin
        //example 1: Type 'Hi!' 4 times in the console

        //1.Yol: Tavsiye edilmez.Not recommended

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol:

/*        for (Baslangic Degeri; Loop Calisma Kurali; Artirma/Eksiltme) {
            Calisacak Kodlar
        }*/

        //Artirma ==> Increment, Azaltma ==> Decrement
        // Baslangic Degeri; Loop Calisma Kurali; Artirma/Eksiltme

        for (int i = 0    ;  i < 4             ;   i++) {
            System.out.println("Hi...");
        }


    }
}

