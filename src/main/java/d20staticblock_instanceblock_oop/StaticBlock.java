package d20staticblock_instanceblock_oop;

public class StaticBlock {

    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price’i alacak
    // ve class’in heryerinde bu degeri kullanacak.
    //Scenario: There will be a discount on prices in February. The class will get the price automatically when called
    // and will use this value everywhere in the class

    //Bir variable olusturup deger atamazsaniz o variable’i initialize etmediniz demektir

    static double pi ;

    static int price;

    //--------------------
    static{
        System.out.println("Static block 2");
    }






    static {//statik block
        //static bloklar içinde yerel değişkenler tanımlanamaz ama deger atanir
        pi=3.14;
        System.out.println("Statik block 1");
    }


    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method ici");




    }

}
