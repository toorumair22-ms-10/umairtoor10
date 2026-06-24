public class main2 {
    public static void main(String[] args) {

        owner o1 = new owner("umair", 18);
        DOG d = new DOG(o1);

        d.display();
    }
}

class owner {
    String name;
    int age;

    public owner(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class DOG {
    owner o;

    public DOG(owner o) {
        this.o = o;
    }

    public void display() {
        System.out.println("Owner name: " + o.name);
    }
}

