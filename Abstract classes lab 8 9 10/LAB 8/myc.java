
public class myc {
    public static void main(String[]args){
        A a1=new A();
        B b1=new B();
        A a2=new B();
        }
}
class A {
   public  void show(int x) {
        System.out.println("TAHA");
    }

   private void show(int x,int y){
        System.out.println("TAHA:"+(x*y));
    }
    float show(float a){
        System.out.println("TAHA:"+a);
        return 4.0f;
    }
}
class B extends A {

      public void show(int x){
        System.out.println("TUAHA");
    }

}
