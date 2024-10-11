package d21oop;

public class Vehicle {

        /*Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
        en ustteki parent class'tan baslatilarak alta doğru calistirilir*/

        // Constructor olusturalım
    public Vehicle(){
        this("Honda",2024,"Elektirkli");

        System.out.println("Honda ,2023,Benzin");
    }
    public Vehicle(String marka,int yil,String motor){
        super  ();
        System.out.println("Honda,2024,Elektrikli");
    }



}
