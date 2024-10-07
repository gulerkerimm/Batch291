package d17constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {

        //4- Car class'indan bir object uretelim

        //9- Default Car() icine parametre girelim

        Car c1 = new Car("BMW", "3.20", 2024, false);
        System.out.println(c1.brand); //Honda //BMW
        System.out.println(c1.model); //Accord //3.20
        System.out.println(c1.year); //2023 //2024
        System.out.println(c1.hybrid); //true //false

        c1.action(); //Honda hizli hareket eder //BMW hizli hareket eder
        c1.stop(); //Honda guvenli bir sekilde durur //BMW guvenli bir sekilde durur

        //5- Car class'a donup, constructor olusturalim

        //10- Baska bir object uretelim ve direkt objeyi yazdiralim
        Car c2 = new Car("Audi", "A4", 2018, false);
        System.out.println(c1); //reference alindi //Car{brand='BMW', model='3.20', year=2024, hybrid=false}
        System.out.println(c2); //reference alindi //Car{brand='Audi', model='A4', year=2018, hybrid=false}

        //11- Reference durumunu duzeltmek icin Car class'a tostring methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //16- Yeni bir object uretelim-SON
        Car c3 = new Car("Tofas", "Sahin");
        System.out.println(c3); //Car{brand='Tofas', model='Sahin', year=2023, hybrid=true}


    }
}