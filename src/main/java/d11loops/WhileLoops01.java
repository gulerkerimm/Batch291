package d11loops;

public class WhileLoops01 {
    public static void main(String[] args) {

        //------------for kalibi

/*        for (baslangic degeri; loop calisma kurali; artirma/azaltma){
            calisacak kodlar
        }*/

        //------------while kalibi
/*        baslangic degeri
                while (loop calisma kurali){
                        calisacak kodlar
                        artirma/azaltma
                }*/

        //Ornek 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz (3 ve 6 dahil).
        //Example 1: Write integers from 3 to 6 to console (including 3 and 6)

        //1.yol: for loop
        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }

        System.out.println("--------------");
        //2.yol: while loop
        int i = 3;
        while (i <=7) {
            System.out.println(i);
            i++;
        }

        //--------------------
        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console’a yazdiriniz(12 dahil).
        //Example 2: Write the even integers from 23 to 12 to the console (including 12)
        System.out.println("----------------------");
        int k = 23;
        while ( k>11){
            if (k%2==0){
                System.out.println(k);


            }
        k--;

        }



    }
}