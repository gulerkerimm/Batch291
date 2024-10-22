package d28exception_enum;

public class ExceptionRunner2 {
    public static void main(String[] args) {

        numberOfStudents(-67);

    } //main disi

    public static void numberOfStudents(int sayi) {
        if (sayi < 0) {
            throw new InvalidNumberException("Bir okuldaki ogrenci sayisi negatif olamaz");
        } else {
            System.out.println(sayi);
        }
    }

    /*Java’da final, finally ve finalize() terimleri farklı amaçlarla kullanılan üç farklı kavramı temsil eder.

	final:
    Değişkenler İçin: final keyword'uyle tanımlanan bir variable sadece bir kez değer alabilir.
    Bu, değişkenin değerinin sonradan değiştirilemeyeceği anlamına gelir. Yani, bu değişken sabittir (constant)

    Metotlar İçin: final keyword'uyle tanımlanan bir metot, child class'lar tarafından
    override edilemez.

    Class'lar İçin: final keyword'uyle tanımlanan bir class, genişletilemez (extends edilemez).
    Yani bu class'in child'i olmaz.

	finally:
    finally bloğu, try-catch yapısının bir parçasıdır. Bu blok, try bloğunda bir istisna oluşsa da
    oluşmasa da her zaman çalıştırılır.Genellikle kaynakların serbest bırakılması,
    dosyaların kapatılması gibi temizleme işlemleri için kullanılır.

	finalize():
    Bu, Object sınıfında tanımlanan bir metottur ve varsayılan olarak hiçbir işlem yapmaz.
    Bir nesne bellekten kaldırılmadan hemen önce Garbage Collector (Çöp Toplayıcı) tarafından
    otomatik olarak çağrılır. Genellikle dış kaynakların serbest bırakılması için kullanılır,
    ancak modern Java uygulamalarında kullanımı önerilmez.*/

}