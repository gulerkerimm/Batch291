package d16methodcreation_overloading_varargs_passbyvalue;

public class CarRunner {
    public static void main(String[] args) {

        //4- Car class'indan bir object uretelim

        Car c1 = new Car();
        System.out.println(c1.brand); //Honda
        System.out.println(c1.model); //Accord
        System.out.println(c1.year); //2023
        System.out.println(c1.hybrid); //true

        c1.action(); //Honda hizli hareket eder
        c1.stop(); //Honda guvenli bir sekilde durur

        //5- Car class'a donup, constructor olusturalim

    }
}