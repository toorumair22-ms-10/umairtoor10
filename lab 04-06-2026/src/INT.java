public interface INT {
    static void main(String[] args) {
        A a=new B();
        a.name();
        a.age();

    }
}
interface A{
    void name();
    void age();
//    void section(){
//        System.out.println("C");
//    }
}
class B implements A{
    public void name(){
        System.out.println("UMAIR");
    }
    public void age(){
        System.out.println("18");
    }
}

