package POST_MID;
class students{
    String name;
     int age;
    private char section;
    public void setA(char sec) {
        this.section = sec;
    }
    public char getA(){
        return section;
    }

    @Override
    public String toString() {
        return "students("+"Name="+name+','+"age="+age+','+"section="+section+")";
    }

    public int getAge(){
    return age;}
    public void setAge(int age){
        this.age=age;
    }}

public class practice {
    public static void main(String[]args){
        System.out.println("OBJECT ORIENTED PROGRAMMING");
        students s1=new students();
        students s2=new students();
        students s3=new students();
        /*s1.name="Taha";
        s1.age=10;
        s1.section='a';
        s2.name="Abdullah";
        s2.age=11;
        s2.section='b';
        s3.name="Hadi";
        s3.age=12;
        s3.section='c';
        System.out.println(s2);*/
        s1.setAge(10);

        System.out.println("%%"+s1.getAge()+"%%");
        s1.setA('A');
        System.out.println(s1.getA());


    }
}
