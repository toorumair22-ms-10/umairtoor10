class LearnerInfo {

    String name;
    int age;
    private char group;

    public void assignGroup(char grp) {
        group = grp;
    }

    public char fetchGroup() {
        return group;
    }

    public void updateAge(int value) {
        age = value;
    }

    public int readAge() {
        return age;
    }

    @Override
    public String toString() {
        return "LearnerInfo(" +
                "age=" + age +
                ", group=" + group +
                ")";
    }
}

public class PP{

    public static void main(String[] args) {

        System.out.println("JAVA OBJECTS");

        LearnerInfo l1 = new LearnerInfo();
        LearnerInfo l2 = new LearnerInfo();
        LearnerInfo l3 = new LearnerInfo();

        l1.updateAge(10);
        l1.assignGroup('A');

        System.out.println("Age = " + l1.readAge());
        System.out.println("Group = " + l1.fetchGroup());

        System.out.println(l1);
    }
}
