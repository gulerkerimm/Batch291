package d18datetime_stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

        //1-reverse(): StringBuilder Object'inin içeriğini ters çevirir.String class'ta yoktur

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy

        sb1.reverse();
        System.out.println(sb1); //ysae si avaJ

        //---------------------
        //2- deleteCharAt(int index): Belirtilen konumda(index'te) bulunan karakteri siler.
        sb1.deleteCharAt(1);
        System.out.println(sb1); //yae si avaJ

        //---------------------
        //3- delete(int start - dahil , int end - haric): Belirtilen aralıktaki karakterleri siler.
        sb1.delete(0, 2);
        System.out.println(sb1); //e si avaJ

        //---------------------
        //4-replace(int start-dahil, int end-haric, String str): Belirtilen indexteki karakterleri verilen stringle değiştirir.
        sb1.replace(0, 2, "hasan");
        System.out.println(sb1); //hasansi avaJ

        //---------------------
        //5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
        // Buradaki offset, eklemenin başlayacağı konumu belirtir ve aslında bir index görevi görür.
        sb1.insert(2, "34");
        System.out.println(sb1); //ha34sansi avaJ

        //---------------------
        //6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
        // int değeri döndürür.Sozluk gibidir.Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa, negatif deger döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden sonra geliyorsa, pozitif deger döndürür.
        // Farkli olan iki harfin ascii kodlari arasindaki farki verir.
        // Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur.
        // Kelimelerin sözlük sıralamasını belirleyebilirsiniz, kelimeleri alfabetik sıraya göre sıralayabilirsiniz.


    }
}