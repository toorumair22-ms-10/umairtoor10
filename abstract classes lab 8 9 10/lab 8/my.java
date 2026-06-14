public class my {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Child obj2 = new Child();
        Parent obj3 = new Child();

    }
}

class Parent {

    public void display(int num) {
        System.out.println("ALI");
    }

    private void display(int num1, int num2) {
        System.out.println("ALI:" + (num1 * num2));
    }

    float printValue(float value) {
        System.out.println("ALI:" + value);
        return 4.0f;
    }
}

class Child extends Parent {

    @Override
    public void display(int num) {
        System.out.println("AHMAD");
    }

}