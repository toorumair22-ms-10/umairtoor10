// Student class demonstrating basic OOP concepts
class students2 {

    // Instance variables (data members)
    String name;        // Student name
    int age;            // Student age
    private char section; // Section is private (encapsulation)

    // Setter method for section
    public void setA(char sec) {
        this.section = sec;
    }

    // Getter method for section
    public char getA() {
        return section;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Overriding toString() to display object data clearly
    @Override
    public String toString() {
        return "students(" +
                "Name=" + name + ", " +
                "age=" + age + ", " +
                "section=" + section +
                ")";
    }
}


// Main class
public class practice2{

    public static void main(String[] args) {

        System.out.println("OBJECT ORIENTED PROGRAMMING");

        // Creating objects of students class
        students s1 = new students();
        students s2 = new students();
        students s3 = new students();

        // Setting values using setters
        s1.setAge(10);
        s1.setA('A');

        // Printing age using getter
        System.out.println("%%" + s1.getAge() + "%%");

        // Printing section using getter
        System.out.println(s1.getA());

        // Printing full object (calls toString automatically)
        System.out.println(s1);
    }
}