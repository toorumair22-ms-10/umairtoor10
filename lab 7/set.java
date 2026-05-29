package FILE_HANDLING;
public class set {
    public static void main(String[]args){
        st1 ss=new st1("taha",162);
        ss.setName("DAVID");
        ss.display();
    }
}
class st1{
    private String name;
    private int roll;
    st1(String name,int roll){
        this.name=name;
        this.roll=roll;

    }
    public void display(){
        System.out.println("Student name:"+this.name);
        System.out.println("Student roll:"+this.roll);
    }

    public void setName(String name) {
        this.name = name;
    }
}