public interface INT1 {
    static void main(String[] args) {
        A1 a=new B1();
        a.name();
        a.age();
        a.section();
    }
}
abstract class A1{
    abstract void name();
    abstract void age();
    void section(){
        System.out.println("C");
    }
}
class B1 extends A1{
    public void name(){
        System.out.println("UMAIR");
    }
    public void age(){
        System.out.println("18");
    }
}
