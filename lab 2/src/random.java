import java.util.Scanner;
public class random {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int random= (int)(Math.random() * 11);
        System.out.println("enter the number");
        int userguess= sc.nextInt();
        System.out.println("the number you entered" + userguess);
        if(userguess == random){
            System.out.println("you guessed correct");
        }else{
            System.out.println("try again");
        }


    }
}
