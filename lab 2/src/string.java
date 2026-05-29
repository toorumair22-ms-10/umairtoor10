public class string {
    public static void main(String[] args){
        String firstname = "umair";
        String lastname = "toor";
        String fullname= firstname + " " +  lastname;
        System.out.println("the length of the name is" + fullname.length());
        System.out.println("the uppercase of fullname is" + fullname.toUpperCase());
        System.out.println("the index of the given word is" + fullname.indexOf("t"));
    }
}
