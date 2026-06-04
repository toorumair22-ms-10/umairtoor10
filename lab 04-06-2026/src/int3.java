public class int3{
    static void main(String[] args) {
        B3 b=new B3();
        b.age();
        b.name();
        b.section();
    }
}


interface A3{
    void name();
    void age();
//    void section(){
//        System.out.println("C");
//    }
}
abstract class C3{
    abstract void section();
}
class B3 extends C3 implements A3{
    public void name(){
        System.out.println("umair");
    }
    public void age(){
        System.out.println("18");
    }
    public void section(){
        System.out.println("C");
    }
}
