package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s=new Student();

        System.out.println(s.name);//Ali Can

        System.out.println(s.getAge());//13

        System.out.println(s.isSuccessful());

        s.setAge(25);
        System.out.println(s.getAge());//25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());
    }

}
