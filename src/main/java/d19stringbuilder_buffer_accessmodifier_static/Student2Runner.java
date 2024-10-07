package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println(Student2.stdName);//Ali Can
        // statik class memberlara ulaşmak için sadece class ismi yeterlidir
        Student2 ali=new Student2();
        System.out.println(ali.age);//18
        //age number non statik olduğu için ona ulaşmak için object oluşturmak zorundayız

        Student2.staticMethod();//ben statik bir methodum
        ali.nonStaticMethod();//ben non statik bir methodum


    }
}
