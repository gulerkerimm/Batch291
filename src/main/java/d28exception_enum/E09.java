package d28exception_enum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E09 {
    public static void main(String[] args) {

        //Not: Bir onceki uygulamamizda method signature icine exception eklemesi yaptik.
        // Bu seferde try-catch kullanalim

        /*
        1) FileNotFoundException ve IOException Compile Time Exception'lardir. Yani kodu yazarken hata aliriz.
        2) IOException Class, FileNotFoundException class'in parent'idir yani
            istenirse FileNotFoundException yerine IOException'da kullanilabilir
        3) IOException ve FileNotFoundException beraber kullanilacak ise FileNotFoundException üstte olmalidir
         */

        try {

            FileInputStream fis = new FileInputStream("src/main/java/d28exception_enum/file.txt");

            int k = 0;

            while ((k = fis.read()) != -1) {
                System.out.print((char) k); //type casting //Java kolaydir
            }


        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }
}