package POST;

class Learner{
    String fullName;
    int years;
    private char batch;

    public void assignBatch(char batchName) {
        batch = batchName;
    }

    public char readBatch() {
        return batch;
    }

    public void updateYears(int value) {
        years = value;
    }

    public int fetchYears() {
        return years;
    }

    @Override
    public String toString() {
        return "Learner(" +
                "fullName=" + fullName +
                ", years=" + years +
                ", batch=" + batch +
                ")";
    }
}

public class learn{
    public static void main(String[] args) {

        Learner l1 = new Learner();
        Learner l2 = new Learner();
        Learner l3 = new Learner();

        l1.updateYears(10);
        System.out.println("Student Age: " + l1.fetchYears());

        l1.assignBatch('A');
        System.out.println("Student Batch: " + l1.readBatch());
    }
}
