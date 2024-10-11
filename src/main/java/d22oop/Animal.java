package d22oop;

public class Animal {

    //-------------------
    //OOP (Object Oriented Programming -  Nesne Tabanlı Programlama)
    //Gerçek hayatta gördüğümüz birçok Object'in (nesnenin) bilgisayar ortamına aktarılma şeklidir.
    //Yani bir object'in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar
    // ortamında gösterilmesi buna örnek olarak verilebilir.

    //-------------------
    /*Object Yönelimli Programlamanın Faydaları:
    1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
    2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
    ile çalıştırılabilir. Substring() method’u 1 kere yazilmis ama surekli kullanabiliyoruz.
    3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
    4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
    5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class’ ta değişiklik
    yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/

    //-------------------
    /* OOP’leri 4 temel özellikte inceleyebiliriz.
    1. Inheritance - Miras Alma
    2. Polymorphism - Çok Biçimlilik
    3. Encapsulation - Kapsülleme
    4. Abstraction - Soyutlama
    */

    //-------------------
    /*1.Inheritance, OOP’nin dort temel ozelliginin 1.sidir.
    Ozellikleri bir class'tan diğer class'lara alan bir kavramdır.*/

    /*Bunun Java daki karsiligi sudur: Siz bir class olusturacaksiniz ama daha once olusturulmus
    bir class sizin istediginiz ozelliklerin bircogunu kapsiyor.
    O zaman direkt yeni olusturdugunuz classi, ozelliklerini kullanmak istediginiz classa ‘child’ yapmalisiniz.
    Bunu da ‘extends’ keyword’unu kullanarak yapiyoruz.*/

    /*
    Inheritance’in Faydalari nelerdir?

    1) Kodun yeniden kullanılmasına yardımcı olur.
    2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve
    emekten tasarruf sağlayabiliriz.
    3) Kolayca update yapabiliriz.
    4) Class’lari kuculturuz.
    5) Daha az geliştirme ve bakım maliyetine yol açar.
    */
    //-------------------
    //a) Java ‘Multiple Inheritance' i desteklemez. ‘Single Inheritance’ i destekler.

    //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
    //   'Hierarchical Inheritance' denir ve Java bunu kabul eder.

    /*c) Ama coklu parent’lardan yararlanamamak iyi olmadi. Ozelliklerini inherit etmek istedigimiz
    class’lar birden fazla ise (parent’lar) o durumda Java bize,
    Apartman tarzi yapilanma olusturmustur.( 'Multi Level Inheritance’) Java bunu kabul eder.*/

    // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir
    // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir

    /*
    HAS-A Relationship, bir class'in başka bir class'i içerdiği ilişkiyi ifade eder.
    Yani, bir class başka bir class'in bir parçası olduğunda HAS-A ilişkisi vardır.
    Bu ilişki bileşim (composition) veya toplama (aggregation) ile sağlanır.

    IS-A Relationship, bir class'in başka bir class'in bir türü olduğu anlamına gelir.
    Bu ilişki, bir class'in  başka bir class'tan türediği (miras aldığı) durumlarda ortaya çıkar.
    Bu durum kalıtım (inheritance) ile sağlanır.

    IS-A ilişkisi child class'tan parent class'a doğru çalışır.
    Yani, bir alt class üst class'in bir türüdür.
     */

    //---------------------------------------
    //2.Polymorphism:
    //Method Overloading + Method Overriding

    //OOP'nin prensiplerinin 2.sidir. Polymorphism (cok bicimlilik) demektir.
    //Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.

    //iki cesidi var.

    // i.Method Overloading: Bunu gormustuk

    //ii.Method Overriding (gecersiz kilmak, agir basan)
    // Child class'in Parent'taki methodu degistirerek kullanmasidir.

    //----------------
    //Override isleminde access modifier’larin durumlari ne olmalidir, onu ogrenelim

    /*Soru1: private method'lar override edilebilir mi?
    Cevap1: private method'lar override edilemezler cunku
    override edebilmek icin o method'a baska bir class'dan ulasabilmek gerekir.
    Ama private method'lar baska classlardan ulasilamaz methodlardir.

    Not: child’in access modifier’i parent’tan daha dar olamaz.
    Ornek: parent public - child protected olamaz cunku bu hata,
    Child class'ının eat metodunun, Parent class'ının eat metodundan daha az erişilebilir olmasından kaynaklanır.
     */
    //---------------
    //Override isleminde access modifier’larin durumlarini ogrendik.
    //Simdi de return type durumlarina bakalim.

    //Parent icinde data type’i olan bir method olusturup child’da override edelim

    //---------------
    //Parent’ta int veri turunde bir method acip, child’da override etseydik ne olurdu?
    //---------------
    //Peki Parent’ta Class veri turunde bir method acip, child’da override etseydik ne olurdu?

    /*Return type void ise degisim olmaz. Hep void olarak kalir*/

    //Soru2: static method’lar override edilebilir mi?
    //Cevap2: static method’lar override edilemezler cunku; static variable veya method’lar tum objeler icin ortaktir.
    // Java static method’larin override edilmesine musaade etmez.

    /*Final keyword'u: Override'da ozel bir durum vardir:

    1- Java'da "final" anahtar kelimesi (keyword) ile işaretlenen bir method, alt class'lar tarafından override edilemez.
    2- Yani, bir class'in child'lari, final olarak işaretlenmiş bir methodu değiştiremez veya üzerine yazamaz.
    3- Bu method, final olarak işaretlenerek nihai ve değiştirilemez hale getirilir.
    4- Final Variables, Final Classes, Final Parametreler'de olabilir.

    Sonuc: "Final" kelimesi, programcılara kodlarını daha güvenli ve öngörülebilir hale getirme, optimizasyon sağlama
    veya belirli davranışları zorlamada yardımcı olmak için kullanılır.*/


    //ODEV: final overload'a engel midir?




    public void eat() {
        System.out.println("Animals eat...");
    }

    public Animal create(){ //Data type Animal'dir
        return new Animal(); //Animal objesi uretip disari Animal verdiniz
    }

    public int add(int a, int b){
        return a + b;
    }

    public Number multiply(Integer a, Integer b){
        return a * b;
    }

    public void drink() {
        System.out.println("Animals drink...");
    }








}
