package d20staticblock_instanceblock_oop;

import javax.print.attribute.IntegerSyntax;

public class InstanceBlock1 {

    /* instance (örnek) blok, bir Class'in her Object'i (nesnesi) oluşturulduğunda çalışan bir kod bloğudur.

       Instance bloklarının temel özellikleri şunlardır:

    1- Her Örnek İçin Çalışır: Instance blok, bir class'in her örneği oluşturulduğunda çalışır.
    Yani, her yeni object için bu blok tekrar çalışır.

    2- Kod Tekrarını Önler: Instance blokları kullanarak, her Object'in başlatma işlemlerini veya belirli kod
    parçalarını tekrar tekrar yazmaktan kaçınırsınız.

       Gerçek hayattan bir örnek: Bir otomobil Class'i düşünün. Her otomobilin örneği (nesnesi-object'i)
       oluşturulduğunda, otomobilin rengini ve yakıt türünü belirlemek için instance bloklarını kullanabilirsiniz.

        Örneğin: instance blok, her otomobil Object'i oluşturulduğunda çalışır ve
        otomobilin rengini siyah ve yakıt türünü benzin olarak başlatır.
        Bu, her yeni otomobilin aynı başlangıç değerleriyle başlamasını sağlar.
        Diger ozellikler sonra ayarlanir ki tekrardan kurtuluruz*/

    //Instance block olusturalim

    {
        System.out.println("Merhaba Java Kullanicilari");
    }
    public static void main(String[] args) {

        InstanceBlock1 obj1=new InstanceBlock1();//Merhaba Java Kullanicilari
        InstanceBlock1 obj2=new InstanceBlock1();//Merhaba Java Kullanicilari






    }
}
