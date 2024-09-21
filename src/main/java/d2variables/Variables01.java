package d2variables;

import java.sql.SQLOutput;

public class Variables01 {

    public static void main(String[] args){

         //Java bu satırı okumaz. kendimize veya başkasına açıklamadır.

       /*
       1) Java dili Strongly Typed’dir, bu nedenle Java’daki her değişken(variable), belirli
        veri türü(data type) ile iliskilendirilmelidir.
        2) Kod yazanin değişkenlere uygun değerlerin atandığından emin olması her zaman gerekir.
        Aksi takdirde hata oluşur.
        */

        //Ornek 1: String data tipinde ismi hi olan bir variable olusturarak,
        // icine "Hello World" yukleyip console'a yazdiriniz.

        //Example 1: By creating a String data type variable with the name hi,
        // load "Hello World" into it and write it to the console.

        //Siralama nasil olacakti?
        //data type ==> variable name ==> atama operatoru ==> data ==> noktali virgul

        String            hi                 =          "Hello World"      ;
        System.out.println(hi);

        //------------------------

        //Ornek 2 : Tamsayi(int) data tipinde ismi age olan bir variable olusturunuz
        // ve icine 15 yukleyip console’a yazdiriniz
        //Example 2: Create a variable with the name age of integer (int) data type
        // and load 15 into it and write it to the console

        int age = 15;
        System.out.println(age);

        //--------------------------------

        /*Java Primitive Data Types:
        Not 1 : primitive data type'larini Java olusturmustur, biz olusturamayiz
        Not 2 : primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
        Not 3 : primitive datalar, data type'larina gore memory'de farkli farkli yer kaplarlar
        Not 4 : primitive datalar, iclerinde sadece sizin atadiginiz degeri barindirirlar*/

        //1- byte data type:
        //tam sayilar icindir. Hafizada 1 byte(8 bit) yer kaplar
        //-128 den + 127’e tamsayi degerleri icin kullanilir

        byte studentAge = 13;
        System.out.println(studentAge);

        //-------------------------------
        //2- short data type:
        //Tam sayilar icindir. Hafizada 2 byte(16 bit) yer kaplar. Aralik (range) genisledi.
        //-32768 den + 32767’e tamsayi degerleri icin kullanilir

        //Ornek 1: Site nufusu icin bir variable olusturun ve 1200 degerini atayin.
        //Example 1: Create a variable for the site population and assign it the value 1200.

        short sitePopulation = 1200;
        System.out.println (sitePopulation);

        //-------------------------------

        //3- int data type:
        //tam sayilar icindir. Hafizada 4 byte (32 bit) yer kaplar
        //-2,147,483,648 ile 2,147,483,647’e tamsayi degerleri icin kullanilir

        //Ornek 1: Ulke nufusu icin bir variable olusturun ve deger atayin.
        //Example 1: Create a variable for the country population and assign a value.

        int countryPopulation =84234345;
        System.out.println("countryPopulation = " + countryPopulation);


        //Ornek 2: Iki tane int variable olusturun ve toplamlarini console'a yazdirin.
        //Example 2: Create two int variables and print their sums to the console

        int a = 12 , b=13 ;
        System.out.println(a+b);
        System.out.println("a+b = "  + a+b);



    }

}
