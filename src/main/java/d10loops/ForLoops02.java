package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {

        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> “Tramvay”==> “Tr”*/
        /*Example 1: Write all characters before the first letter 'a' in a given String to the console*/

        //charAt() methoduna index verince size karakteri getirir.
        //break keyword’u, bir döngüyü veya bir switch ifadesini erken
        // bir şekilde sonlandırmak için kullanılır.

        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) { // i <= s.length() -1

            char ch = s.charAt(i);

            if (ch == 'a') {
                break;
            }

            System.out.print(ch); //Tr

        }

        System.out.println("-----------------");
        //----------------------
        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A

        //Example 2: Write the code that does not print lowercase letters in a given String to the console

        String s1 = "Pwd12?Ab";

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue; //geri kalan kodlari yurutme, artirma azaltmaya git
            } else {
                System.out.print(ch); //P12?A
            }
        }

        System.out.println();
        //------------------------interview sorusu (is gorusmesi)

        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.
        //example 3: Write the code that reverses a given String

        //           String t = "Ali Can";  ==> “naC ilA”
        //Loop olustururken baslangic ve bitis degeri cok onemlidir

        //son index her zaman length()-1’tir

        String t = "Java";
        String reverse = "";                                        //ters cevirince bunun icinde saklayacagiz

        for (int i = t.length() - 1;    i >= 0;                                i--) {

            reverse = reverse + t.charAt(i);

            //System.out.println("loop ici : " + reverse);
        }
        System.out.println(reverse);

    }
}