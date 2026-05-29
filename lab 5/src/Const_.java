class StudentData {
    private String fullName;
    private int rollNum;
    private float score;

    public StudentData(String studentName, int id, float points) {
        this.fullName = studentName;
        this.rollNum = id;
        this.score = points;
    }

    public String fetchName() {
        return this.fullName;
    }
}

public class Const_ {
    static void main(String[] args) {
        StudentData student = new StudentData("umair", 12, 14.0f);
        System.out.println(student.fetchName());
    }
}
