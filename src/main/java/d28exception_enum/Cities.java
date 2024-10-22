package d28exception_enum;

public enum Cities {

    /*Java'da enum (enumeration - sıralama), bir dizi sabit değeri temsil etmek için kullanılan özel bir class türüdür.
   enum yapısı, belirli bir değer kümesini temsil eden sabitleri (constants) tanımlamak için kullanılır.
   Degisme ihtimali olmayan verileri tutarlar.(ay, gun isimleri gibi) ve buyuk harfle yazilirlar.

   enum'un temel avantajları şunlardır:

    Tip Güvenliği: enum ile tanımlanan bir değişken, sadece belirtilen enum değerlerinden birine sahip olabilir.
    Bu, geçersiz değerlerin atanmasını engeller.

    Kod Okunabilirliği: enum kullanımı, kodun okunabilirliğini artırır, çünkü anlamlı isimlere sahip
    sabitleri kullanabilirsiniz.

    Kod tekrarını azaltır: Enumlar, aynı sabit değerleri birden çok kez tanımlamayı önler.
    Bu, kod tekrarını azaltır. Ve dis kaynaklara bagimliligi kaldirir.

    Ornegin illeri app’inizde saklarsiniz, gerektiginde cagirir kullanirsiniz.
    Bir siteden cekmezsiniz. Cunku site cokmus olabilir*/

    //---------------
    /* Expected 0 arguments but found 3 hatası,Cities enum yapısında. Her bir enum değeri için 3 argüman sağladık

     (int, String, String). Bu argümanları kabul eden bir yapıcı (constructor) tanımlamanız gerekiyor.
    ama once 3 tane variable olusturalim

    private, bir değişkenin yalnızca class'in içinden erişilebilir olmasını sağlar.
    Bu, değişkenin dışarıdan erişilmesini ve değiştirilmesini önler.(encapsulation)

    final, bir değişkenin değerinin değiştirilemeyeceğini belirtir.
    Bu, plaka kodunun yalnızca bir kez ayarlanmasını sağlar.

    Açıklama: Enum'lar, önceden tanımlanmış sabit değerleri temsil eden yapılardir.
    Bu nedenle, plaka kodu, yalnızca enum'un içinden ayarlanmalı ve değiştirilmelidir.
    Dışarıdan erişilmesi veya değiştirilmesi, enum'un tutarlılığını bozabilir.*/

    //-----------
    /*
    1) enum’daki datalar sabittir
    2) enum’dan new keywordu ile yeni bir object olusturamazsiniz
    3) Cunku enum icine koymus oldugunuz her bir sabit data bu classtan olusturulmus bir object mantigi ile calisir
    4) enum icerisine koymus oldugumuz her bir sabit default olarak public static ve final’dir.
    (Burada iller kastediliyor-enum tanımlarken bu anahtar kelimeleri sabitlerin önüne yazmak gerekmez
    ve yazılamaz da; dilin sözdizimi bunu desteklemez)
    5) Bu nedenle enum icindeki her bir sabit dataya enum ismi yazarak ulasabilirsiniz
    6) enum’daki constructor yeni bir object olusturmak icin degil, enum’in icindeki her bir sabit
    datanin icindeki variable’lari baslatmak icin kullanilir
    */

    ADANA(1, "Adana", "01000"),
    ADIYAMAN(2, "Adıyaman", "02000"),
    AFYONKARAHİSAR(3, "Afyonkarahisar", "03000"),
    AĞRI(4, "Ağrı", "04000"),
    AMASYA(5, "Amasya", "05000"),
    ANKARA(6, "Ankara", "06000"),
    ANTALYA(7, "Antalya", "07000"),
    ARTVİN(8, "Artvin", "08000"),
    AYDIN(9, "Aydın", "09000"),
    BALIKESİR(10, "Balıkesir", "10000"),
    BİLECİK(11, "Bilecik", "11000"),
    BİNGÖL(12, "Bingöl", "12000"),
    BİTLİS(13, "Bitlis", "13000"),
    BOLU(14, "Bolu", "14000"),
    BURDUR(15, "Burdur", "15000"),
    BURSA(16, "Bursa", "16000"),
    ÇANAKKALE(17, "Çanakkale", "17000"),
    ÇANKIRI(18, "Çankırı", "18000"),
    ÇORUM(19, "Çorum", "19000"),
    DENİZLİ(20, "Denizli", "20000"),
    DİYARBAKIR(21, "Diyarbakır", "21000"),
    EDİRNE(22, "Edirne", "22000"),
    ELAZIĞ(23, "Elazığ", "23000"),
    ERZİNCAN(24, "Erzincan", "24000"),
    ERZURUM(25, "Erzurum", "25000"),
    ESKİŞEHİR(26, "Eskişehir", "26000"),
    GAZİANTEP(27, "Gaziantep", "27000"),
    GİRESUN(28, "Giresun", "28000"),
    GÜMÜŞHANE(29, "Gümüşhane", "29000"),
    HAKKARİ(30, "Hakkari", "30000"),
    HATAY(31, "Hatay", "31000"),
    ISPARTA(32, "Isparta", "32000"),
    MERSİN(33, "Mersin", "33000"),
    İSTANBUL(34, "İstanbul", "34000"),
    İZMİR(35, "İzmir", "35000"),
    KARS(36, "Kars", "36000"),
    KASTAMONU(37, "Kastamonu", "37000"),
    KAYSERİ(38, "Kayseri", "38000"),
    KIRKLARELİ(39, "Kırklareli", "39000"),
    KIRŞEHİR(40, "Kırşehir", "40000"),
    KOCAELİ(41, "Kocaeli", "41000"),
    KONYA(42, "Konya", "42000"),
    KÜTAHYA(43, "Kütahya", "43000"),
    MALATYA(44, "Malatya", "44000"),
    MANISA(45, "Manisa", "45000"),
    KAHRAMANMARAŞ(46, "Kahramanmaraş", "46000"),
    MARDİN(47, "Mardin", "47000"),
    MUĞLA(48, "Muğla", "48000"),
    MUŞ(49, "Muş", "49000"),
    NEVŞEHİR(50, "Nevşehir", "50000"),
    NİĞDE(51, "Niğde", "51000"),
    ORDU(52, "Ordu", "52000"),
    RİZE(53, "Rize", "53000"),
    SAKARYA(54, "Sakarya", "54000"),
    SAMSUN(55, "Samsun", "55000"),
    SİİRT(56, "Siirt", "56000"),
    SİNOP(57, "Sinop", "57000"),
    SİVAS(58, "Sivas", "58000"),
    TEKİRDAĞ(59, "Tekirdağ", "59000"),
    TOKAT(60, "Tokat", "60000"),
    TRABZON(61, "Trabzon", "61000"),
    TUNCELİ(62, "Tunceli", "62000"),
    ŞANLIURFA(63, "Şanlıurfa", "63000"),
    UŞAK(64, "Uşak", "64000"),
    VAN(65, "Van", "65000"),
    YOZGAT(66, "Yozgat", "66000"),
    ZONGULDAK(67, "Zonguldak", "67000"),
    AKSARAY(68, "Aksaray", "68000"),
    BAYBURT(69, "Bayburt", "69000"),
    KARAMAN(70, "Karaman", "70000"),
    KIRIKKALE(71, "Kırıkkale", "71000"),
    BATMAN(72, "Batman", "72000"),
    ŞIRNAK(73, "Şırnak", "73000"),
    BARTIN(74, "Bartın", "74000"),
    ARDAHAN(75, "Ardahan", "75000"),
    IĞDIR(76, "Iğdır", "76000"),
    YALOVA(77, "Yalova", "77000"),
    KARABÜK(78, "Karabük", "78000"),
    KİLİS(79, "Kilis", "79000"),
    OSMANİYE(80, "Osmaniye", "80000"),
    DÜZCE(81, "Düzce", "81000");

    private final int plateCode;
    private final String cityName;
    private final String postalCode;

    Cities(int plateCode, String cityName, String postalCode) {
        this.plateCode = plateCode;
        this.cityName = cityName;
        this.postalCode = postalCode;
    }

    public int getPlateCode() {
        return plateCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }
}