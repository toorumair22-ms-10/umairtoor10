public class greeting {
    public static void main(String[] args){
        String greeting = "Hello my name is";
        String firstname = "umair";
        String lastname = "toor";
        System.out.println(greeting + " " + firstname + " " + lastname);
        System.out.println(greeting.concat(firstname.concat(lastname)));
    }
}
