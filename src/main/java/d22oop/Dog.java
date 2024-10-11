package d22oop;

public class Dog extends Mammal {

    public void bark() {
        System.out.println("Dogs bark...");
    }

    //Herkes Cat class'ta feedWithMilk() methodunu override etsin?

    @Override //Anotation
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){
        return new Dog(); //Upcasting -Java otomatik yapar
        //child parent'inin data tipini kullanabilir
        //downcasting -Java otomatik yapmaz
    }

    @Override
    public int add(int a, int b){
        //primitive'ler arasinda parent-child iliskisi yoktur
        //Yani primitive'lerde return type degistirilemez
        return a + b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }





}