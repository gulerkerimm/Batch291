package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student clastan bir instance oluşturalım

        Student ali=new Student();

        System.out.println("ali.stdName = " + ali.stdName); //ali.stdName = Ali Can
        System.out.println("ali.email = " + ali.email); //ali.email = alican@gmail.com
        System.out.println("ali.adress =" + ali.address);

        System.out.println(ali);




    }
}
