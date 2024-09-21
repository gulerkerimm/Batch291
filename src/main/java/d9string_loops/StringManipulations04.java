package d9string_loops;

public class StringManipulations04 {
    public static void main(String[] args) {

        /*Java’da Bellek Kullanımı:

        Java’da bellek (memory) yönetimi, büyük ölçüde Java Virtual Machine (JVM) tarafından otomatik olarak gerçekleştirilir.
        Java'da iki ana bellek alanı vardır: Heap (yığın) ve Stack (yığın).

        1. Heap Belleği:
            a) Heap, dinamik olarak oluşturulan nesneler (Object ve Array gibi non-primitive türler) için kullanılır.
            b) new anahtar kelimesi ile oluşturduğunuz nesneler heap bölgesinde saklanır.
            c) Heap, daha büyük ve karmaşık veri yapılarının saklandığı bellek alanıdır.

            Bu nedenle Garbage Collector (çöp toplayıcı) tarafından yönetilir.
            Garbage Collector, kullanılmayan nesneleri bellekten otomatik olarak temizler.
            Heap belleği, yavaş ancak büyük veri yapıları için uygundur.

        2. Stack Belleği:
            a) Stack, metod çağrıları ve lokal değişkenler (örneğin, int x = 10;) için kullanılır.
            b) Primitive türler (int, char, boolean vb.) stack belleğinde saklanır.
            c) Stack, LIFO (Last In, First Out) prensibiyle çalışır. Yani en son eklenen veri ilk çıkar.
            d) Stack, hızlı ve verimli bir bellektir, ancak boyutu sınırlıdır.
            e) Non-primitive türlerin referansları (adresleri) stack belleğinde saklanır. Bu referanslar,
            heap belleğinde bulunan nesnelere işaret eder.Bir ülkenin navigasyon sistemi gibi.Heap, daha büyük veri yapılarını barındırır ve adresleme yoluyla stack'ten erişilir.

        Büyük bir şehir haritasına benzetilebilir, çünkü karmaşık veriler burada tutulur ve doğrudan erişilmez,
        sadece referanslar aracılığıyla erişilir.
        */

        String s = "Tom";
        int a = 12;

        /*
        memory kullanimi:

        String’lerin esitliklerini kontrol ederken "==" yerine equals kullaniriz
        cunku == kullanirsaniz, iki String’i karsilastirirken adreslerini kontrol eder.

        equals() methodu ise iki String’i karsilastirirken sadece degerlerine bakar,
        degerleri ayni ise bu iki String esittir der, degerler farkli ise bu iki String farklidir der
         */
        //String str1= "merhaba" ;
        String str1 = new String("Merhaba");
        String str2 = new String("Merhaba");
        String str3 = str1;

        System.out.println(str1 == str2); //false adrese baktı
        System.out.println(str1.equals(str2)); //true içeriğe baktı
        System.out.println(str1 == str3); //true aynı aturan kardeşler











    }
}