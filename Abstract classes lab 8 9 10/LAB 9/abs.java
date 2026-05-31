package INHERITENCE;

public class abs {
    public static void main(String[]args){
        aa a1=new bb();
        a1.ab1();
    }
}
abstract class aa{
    aa(){
        System.out.println("taha");
    }
    abstract void ab1();
    abstract void ab2();

}
class bb extends aa{
    bb(){
        System.out.println("TTTT");
    }
    @Override
    void ab1(){
        System.out.println("I am ab1");
    }

    @Override
    void ab2() {
        System.out.println("I am ab2");
    }
}