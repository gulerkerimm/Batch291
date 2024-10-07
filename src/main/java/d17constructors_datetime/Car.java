package d17constructors_datetime;

public class Car {

    /*Java Object Oriented Programming bir dildir. Yani her seyi object olarak kabul eder.
    Object olustururken de iki sey dikkate alinir. Pasif ve aktif ozellikler.

    Bu gune kadar variable ve methodlar kullandik. Simdi kendi object’lerimizi olusturup kullanacagiz.
    Bunun icin class’lar olusturup, class’larimizin icine variable ve methodlar
    ekleyecegiz ki bunlardan object’ler uretebilelim.*/

    //---------------------
    /*  a- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
        b- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
    main methodu oluşturmanız gerekebilir.
        c- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method’lu class olur.
    Adina da “runner” eklenir.*/
    //----------------------
    //1-variable'lar olusturalim (pasif ozellikler)

    String brand = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    //2-method'lar olusturalim (aktif ozellikler)

    public void action() {
        System.out.println(brand + " hizli hareket eder");
    }

    public void stop() {
        System.out.println(brand + " guvenli bir sekilde durur");
    }

    //3-CarRunner yani main'li class'i olusturalim

    /*6-Constructor nedir?
    Class’tan object olusturmamizi saglayan bolumdur.
    Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
    Bu constructor’lara “default constructor” denir.
    default constructor ===> Car () */

    /*7- Constructor nasil olusturulur?
    Access Modifier + Class ismi + () + {}
    Kendiniz constructor’inizi olusturdugunuz zaman Java default constructor’i siler

    //----------
    Method ile Constructor arasindaki fark nedir? (Interview Sorusu)

    a)Methodlarda return type olur, constructor’larda olmaz
    b)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    c)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.
    (constructorlar objeleri başlatmak ve class'in başlatılmasını sağlamak için kullanılır.)
    d)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

    !!!Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object’ler olusturabiliriz*/
    //----------
    /*
        Java’da iki tur constructor vardir
    a- Parametresiz (default)
        a) otomatik uretilen parametresiz constructor
        b) kullanici tarafindan tanimlanan parametresiz constructor
    b- Parametreli
    */

    public Car (String brand, String model, int year, boolean hybrid) {
        this.brand = brand; // Bu class'taki brand degerini kullanma, ben sana parametre olarak gonderecegim
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    //8-Parametreli constructor'i olusturdugumuzda Java default olani sildi, CarRunner'dakiler o yuzden
    //hataya dustu. Duzeltmek icin CarRunner'a gidelim

    //14- Farkli parametreli constructor olusturalim
    public Car (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    //15- CarRunner'a gidip bu constructor'lari kullanalim

    //12- toString uretelim

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    //13- CarRunner'a gidip tekrar Run edelim




}