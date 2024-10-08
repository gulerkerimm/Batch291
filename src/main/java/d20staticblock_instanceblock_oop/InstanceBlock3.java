package d20staticblock_instanceblock_oop;

import java.sql.SQLOutput;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)


    public String color;

    public String fuelType;
    //-----------------------------------------
    //Instance block - Bu class'tan her object olusturuldugunda calisir


    {
        color="Siyah";
        fuelType="Benzin";

    }
    //-------------------------------------------

    //constructur - Class in objectleri oluşturulduğunda çalışir


    public InstanceBlock3(){
        System.out.println("Araba rengi:"+color);
        System.out.println("Araba yakıt turu :"+fuelType);



    }
    //Default olarak siyah ve benzinle baslatmak istemezsek parametreli constructor olustururuz

    public InstanceBlock3(String color,String fuelType){

        this.color=color;
        this.fuelType=fuelType;

    }









}
