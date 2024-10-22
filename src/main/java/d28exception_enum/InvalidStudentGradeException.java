package d28exception_enum;

public class InvalidStudentGradeException extends Exception{

    /*
    Kendi istisna (Custom Exception class) class’larinizi oluşturabilirsiniz.
    Bunun için genellikle Exception class’ini ya da daha spesifik bir child sınıfı genişleterek (extends) yeni bir class oluşturursunuz.

    Kendi exception class’larinizi oluşturmanız için birkaç neden vardır:

    1- Özelleştirilmiş İstisna Mesajları: Özel istisna sınıflarınızla, belirli bir hata durumu için daha anlamlı ve detaylı hata mesajları oluşturabilirsiniz.

    2-Daha İyi Hata Yönetimi: Özel istisnalar sayesinde hataları daha spesifik olarak yakalayıp, uygun şekilde yönetebilirsiniz.
    (ornegin okul app'inde negatif yas girilmesinde hata firlatabilirsiniz)

    3- İş Kurallarını Tanımlama: Bazı iş kuralları, standart Java istisnalarıyla doğrudan temsil edilemez.

    Bu tür kurallar için özel istisnalar oluşturarak, iş kurallarınızı daha iyi tanımlayabilirsiniz.
    (Java icin negatif veya pozitif yas girilmesinin farki yoktur. Sifira bolme olsaydi vardir) */

    /*4- Daha Anlamlı Loglama: Özelleştirilmiş istisna sınıflarınızla, hatanın neden kaynaklandığına dair
    daha spesifik bilgilere sahip olabilir ve bu bilgileri loglarda saklayabilirsiniz.

    Örnek olarak, belirli bir yaşın altındaki kullanıcıların sisteme kaydolamayacağı bir uygulamanız varsa,
    bu durumu belirtmek için özel bir istisna oluşturabilirsiniz*/

    //Exception yazarsak compile time(checked exceptions) cesidinde bir istisna olusur.(FileNotFoundException gibi)
    // RuntimeException yazsaydik run time cesidinde olusurdu.(ArrayIndexOutOfBoundsException)
    // RuntimeException(unchecked) Exception'ın bir alt sınıfıdir.

    //------------------------
    //Ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez senaryosu uzerinden gidelim.
    //Let’s go through the scenario where the student's grade cannot be entered less than zero or greater than zero.


    public InvalidStudentGradeException(String message) {
        super(message);
    }
}