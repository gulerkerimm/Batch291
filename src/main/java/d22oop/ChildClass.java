package d22oop;

public class  ChildClass extends ParentClass{

    @Override
    public Integer multipy(Integer a, Integer b) {
        //Parent clasin multiply methodunu çağırdık

        Integer sonuc= super.multipy(a, b);

        //ek islevsellik katalım

        return sonuc+10;
        //Parent method degişmez


    }
}
