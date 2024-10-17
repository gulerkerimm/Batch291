package d25collections;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {

        /* Java’da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
        Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
        Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

        Gerçek dünyadan birkaç örnek:

     Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
         bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
         İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.

     Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
         Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.

     Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
         İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.

     Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
         Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

    Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
    Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

    Queue interface’i, LinkedList ve PriorityQueue gibi farklı class’lar tarafından uygulanabilir.*/

        //Queue nasil olusturulur?

        Queue<String> storage = new LinkedList<>();

        //Queue'ya nasil eleman eklenir?
        //1)add(): Belirtilen öğeyi kuyruğa ekler.

        storage.add("sut");
        storage.add("et");
        storage.add("yumurta");
        storage.add("peynir");
        //storage.add(null);
        System.out.println(storage); //[sut, et, yumurta, peynir] - insertion order

        //2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür.
        // Kuyruk boşsa bir istisna fırlatır.

        String s = storage.remove();
        System.out.println(s); //sut
        System.out.println(storage); //[et, yumurta, peynir]

        //3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
        System.out.println(storage.peek()); //et
        System.out.println(storage); //[et, yumurta, peynir]

        //4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.
        storage.clear();
        System.out.println(storage); //[]

        //5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.
        System.out.println(storage.poll()); //null

        //6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.
        //System.out.println(storage.element()); HATA cunku queue bos

        //-------------------------------
        // PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
        // öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
        // Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.

        //Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
        // sayılar kendi doğal sıralamalarına göre önceliklendirilir.

        //Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
        // priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
        // Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.

        //PriorityQueue nasil olusturulur?

        PriorityQueue<String> emergencyQueue = new PriorityQueue<>();

        //PriorityQueue'ya nasil eleman eklenir?
        //add(): Belirtilen öğeyi kuyruğa ekler.

        emergencyQueue.add("Mehmet");
        emergencyQueue.add("Mahmut");
        emergencyQueue.add("Ekrem");
        emergencyQueue.add("Oya");
        emergencyQueue.add("Tansu");
        //emergencyQueue.add(null); HATA
        System.out.println(emergencyQueue); //[Ekrem, Mehmet, Mahmut, Oya, Tansu]

        //-----------------------------
        //Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
        // ve çıkartmaya izin veren bir veri yapısıdır.
        // Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

        //Java'da deque'ler, Deque interface'iyle temsil edilir. Deque arabirimini uygulayan en yaygın class’lar
        // ArrayDeque ve LinkedList sınıflarıdır.

        //---------------Deque nasil olusturulur?
        Deque<String> d = new LinkedList<>();

        //Deque’e nasil eleman eklenir?
        //1) add(): Belirtilen öğeyi ekler.

        d.add("Mehmet");
        d.add("Mahmut");
        d.add("Ekrem");
        d.add("Oya");
        d.add("Tansu");
        System.out.println(d); //[Mehmet, Mahmut, Ekrem, Oya, Tansu]

        //2) addFirst(E e): Deque'in başına bir öğe ekler. Dönüş türü void'dir çünkü
        // sadece eklemeyi gerçekleştirir ve değer döndürmez.

        d.addFirst("Ali");
        System.out.println(d); //[Ali, Mehmet, Mahmut, Ekrem, Oya, Tansu]

        for (String w : d) {
            System.out.println(w);
        }
        System.out.println("---------------");

        //3) addLast(E e): Deque'nin sonuna bir öğe ekler. Dönüş türü yine void'dir.
        d.addLast("Hasan");

        for (String w : d) {
            System.out.println(w);
        }
        System.out.println("---------------");
        //4)removeFirst(): Deque'nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
        // Bu method E türünde bir değer döndürür.(Burda String)
        System.out.println(d.removeFirst()); //Ali
        System.out.println(d); //[Mehmet, Mahmut, Ekrem, Oya, Tansu, Hasan]

        //--------------------------
        //ArrayDeque, Java'da çift yönlü kuyruk (double-ended queue) yapısını temsil eder
        // (verilerini bir dizi (array) içinde saklar) ve Deque arayüzünü uygular.
        // Bu yapı, hem baştan hem sondan ekleme ve çıkarma işlemlerine izin verir.
        // ArrayDeque, LinkedList'e kıyasla daha yüksek performans sunar çünkü içerikleri için dizi tabanlı
        // bir yapı kullanır.ArrayDeque, başta ve sonda hızlı ekleme/çıkarma işlemleri için idealdir.

        //ArrayDeque Nasıl Oluşturulur?

        ArrayDeque<String> ad = new ArrayDeque<>();

        //Eleman Nasıl Eklenir?

        // Baştan Ekleme: addFirst()
        // Sondan Ekleme: addLast()

        ad.addFirst("ilk");
        ad.addLast("son");
        System.out.println(ad); //[ilk, son]

        //Eleman Çıkarma:
        //removeFirst(): Kuyruğun başından bir eleman çıkarır.
        //removeLast(): Kuyruğun sonundan bir eleman çıkarır.

        String a = ad.removeFirst();
        System.out.println(a); //ilk
        System.out.println(ad); //[son]

        String z = ad.removeLast();
        System.out.println(z); //son
        System.out.println(ad); //[]

        //ODEV: ArrayDeque’de belirli bir indekse veya araya doğrudan eleman eklemek için bir metod bulunur mu?






    }
}