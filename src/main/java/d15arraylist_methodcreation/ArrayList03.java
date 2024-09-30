package d15arraylist_methodcreation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //           [12, 23, 10, 19] ==> 12 ve 10


        List<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        System.out.println(nums); //[12, 23, 10, 19]

        //Collections.sort(nums); //1 - Diger koleksiyonlarla da kullanilir
        nums.sort(null);//2 -ArrayList'lerle kullanilir
        System.out.println(nums);

        int minDiff= nums.get(1)-nums.get(0); // 12-10=2

        //--------------------------
        for (int i = 1; i < nums.size(); i++) {

            minDiff= Math.min(minDiff, nums.get(i)- nums.get(i-1));

        }
        System.out.println(minDiff);


        //2, minimum farki bulduk. Bu farki hangi iki sayidan
        //elde ettigimiz bulalim

        //----------------------

        //[10, 12, 19, 23]

        for (int i = 1; i < nums.size() ; i++) {

            if (nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i)+
                " ve "+nums.get(i-1));//12 ve 10
            }
        }
        //ODEV: Bu soru tek for'la veya for each'le cozulebilir miydi?

    }
}
