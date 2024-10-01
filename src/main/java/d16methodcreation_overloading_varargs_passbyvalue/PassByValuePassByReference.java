package d16methodcreation_overloading_varargs_passbyvalue;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        /*Pass by Value (Değer ile Geçiş):

        Bir değişkenin değerini, yani veriyi, bir metoda parametre olarak ilettiğinizde, aslında o değişkenin
        bir kopyasını iletirsiniz. Metodun içinde bu kopya değiştirilse bile, orjinal değişkenin değeri değişmez.
        Degisken ve Object’lerin adreslerinin (reference) kopyasinda calisilir. */

        /* Pass by Reference (Referans ile Geçiş):
        Java’da genel olarak “pass by reference” kullanılmaz. Bunda degisken ve object’lerin adresleri direkt methoda gonderilir.
        Kopya yoktur.Method’a adres yollaninca method, adresi kullanarak orjinal degere ulasir ve degeri degistirebilir.
         Bu yaklasimda hem adres hem de orjinal veri degisebilir.

        //-----------
        Dikkat : Java da Object ile calisirken (heap memory’de), Object’in referansı(adresi) degismez ama
        bazi Object’lerin orjinal içeriği degisebilir (Mutable-Değiştirilebilir- Nesneler : ArrayList, HashMap,StringBuilder)
        (Immutable-Değişmez- Nesneler: Integer, String gibi Wrapper Clas’lar,ENUM)
        //-----------

        Peki Java bunu neden boyle yapar? (Pass by reference kullanımına gore)

        1- Güvenlik:
        "Pass by Value," verilerin kontrolsüz değiştirilmesini engeller. Bu, programın güvenliğini
        artırır çünkü bir metodun içinde değiştirilen veriler, çağrıldığı yerdeki orijinal veriyi etkilemez.

        2-Performans:
        Pass by value, Java'nın performans açısından daha verimli çalışmasını sağlar.
        Adres degisikliginin onune gecilerek hiz saglanir
        */

        int x = 3;
        int y = 5;

        int result = add(3, 5);
        System.out.println(result); //8

    } //main disi

    public static int add(int a, int b) {

        return a + b;

    }


}