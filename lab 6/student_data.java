public class student_data {
    public static void main(String[]args){
        studentss st1=new studentss();
        studentss st2=new studentss();
        st1.setRoll(162);
        st2.setRoll(111);
        st1.setName("THEON");
        st2.setName("Tendulkar");
        System.out.println(st1.getName()+"   "+st1.getRoll());
        System.out.println(st2.getName()+"   "+st2.getRoll());


    }
}
class studentss{
    int roll;
    String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}