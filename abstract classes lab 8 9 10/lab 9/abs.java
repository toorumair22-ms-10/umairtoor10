package INHERITENCE;

public class abs {
    public static void main(String[] args) {

        BaseClass baseRef = new DerivedClass();
        baseRef.methodOne();

    }
}

abstract class BaseClass {

    BaseClass() {
        System.out.println("HELLO");
    }

    abstract void methodOne();

    abstract void methodTwo();

}

class DerivedClass extends BaseClass {

    DerivedClass() {
        System.out.println("WELCOME");
    }

    @Override
    void methodOne() {
        System.out.println("This is methodOne");
    }

    @Override
    void methodTwo() {
        System.out.println("This is methodTwo");
    }
}