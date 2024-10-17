package d23oop_collections;

public class HondaRunner {
    public static void main(String[] args) {

        //Honda h = new Honda(); Abstract class'lardan object uretilemez cunku siniflandirma icin uretildi

        Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        Accord a = new Accord();
        a.engine(); //Gas 2.0 Turbo

        a.music(); //Pro


    }
}