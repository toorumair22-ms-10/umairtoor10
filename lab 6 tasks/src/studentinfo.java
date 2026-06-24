public class studentinfo {
    public static void main(String[] args) {

        Learner l1 = new Learner();
        Learner l2 = new Learner();

        l1.assignNumber(162);
        l2.assignNumber(111);

        l1.assignName("THEON");
        l2.assignName("Tendulkar");

        System.out.println("Name: " + l1.fetchName() +
                " Roll No: " + l1.fetchNumber());

        System.out.println("Name: " + l2.fetchName() +
                " Roll No: " + l2.fetchNumber());
    }
}

class Learner {
    private int number;
    private String name;

    public void assignNumber(int num) {
        number = num;
    }

    public int fetchNumber() {
        return number;
    }

    public void assignName(String n) {
        name = n;
    }

    public String fetchName() {
        return name;
    }
}
