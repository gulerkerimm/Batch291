package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 car1 = new InstanceBlock3();
        //Araba rengi:Siyah
        //Araba yakıt turu :Benzin

        InstanceBlock3 car2 =new InstanceBlock3();
        //Araba rengi:Siyah
        //Araba yakıt turu :Benzin

        //Bir veya daha cok object(instance) daha uretsem, o da siyah ve benzin olur

        //Ancak constructor'larla ozellestirilebilir

        InstanceBlock3 car3=new InstanceBlock3("Kirmizi","Dizel");

        System.out.println("Araba rengi: "+car3.color);
        System.out.println("Araba yakıt türü:  "+car3.fuelType);



    }
}
