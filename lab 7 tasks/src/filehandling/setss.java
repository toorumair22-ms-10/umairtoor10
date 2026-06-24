package filehandling;

public class setss {

    public static void main(String[] args) {

        Record r1 = new Record("umair", 163);

        r1.setStudentName("sherry");
        r1.displayRecord();
    }
}

class Record {

    private String name;
    private int rollNo;

    Record(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayRecord() {
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
    }

    public void setStudentName(String name) {
        this.name = name;
    }
}
