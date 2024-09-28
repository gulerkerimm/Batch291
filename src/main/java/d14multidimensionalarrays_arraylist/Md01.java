package d14multidimensionalarrays_arraylist;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Cok boyutlu dizi (MultiDimensional Array) temel olarak Array’in içine Array koymak anlamına gelir.
        // En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
        // İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.

        //MultiDimensional Array nasil olusturulur?
        int[][] a = new int[3][2]; //3 distaki, 2 icteki eleman sayisi

        //MultiDimensional Array'lere nasil eleman eklenir?
        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 0;

        //MultiDimensional Array konsola nasil yazdirilir?
        System.out.println(Arrays.toString(a)); //[[I@4617c264, [I@36baf30c, [I@7a81197d]

        //MultiDimensional Array'leri yazdirirken toString() degil, deepToString() method'u kullaniriz
        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]]

        //MultiDimensional Array'den spesifik bir eleman nasil yazdirilir?
        System.out.println(a[1][1]); //45

        //MultiDimensional Array icindeki bir Array nasil yazdirilir?
        System.out.println(Arrays.toString(a[2])); //[123, 0]

        //Kisa yoldan MultiDimensional Array nasil olusturulur?
        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}};
        System.out.println(Arrays.deepToString(students));
        //[[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan], [Ceyhan, Burhan]]

        //Ornek 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        //Example 1: Find the total number of names in the students array above.

        int sum = 0;

        //[[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan], [Ceyhan, Burhan]]
        for (String[] w : students) {

            sum = sum + w.length;

        }
        System.out.println(sum); //8

        //------------------------
        //Ornek 2: Yukaridaki students Array'inde icinde "m" olan isimleri console'a yazdiriniz.
        //Example 2: Write the names with "m" in the students Array to the console


        //[[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan], [Ceyhan, Burhan]]
        for (String[] w : students) {
            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);  //Kemal
                    //Cemal
                }
            }
        }


    }
}


