public interface INT2 {
    interface A2{
        void name();
        void age();
//    void section(){
//        System.out.println("C");
//    }
    }
    interface C2{
        void section1();
    }
}

class B2 implements INT2.A2, INT2.C2 {
    public void name(){
        System.out.println("UMAIR");
    }
    public void age(){
        System.out.println("18");
    }
    public void section1(){
        System.out.println("C");
    }
}
