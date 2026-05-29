import java.util.Scanner;
public class inverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number");
        int num = sc.nextInt();
        int inverse=0;
        while(num>0){
            int digit= num%10;
            inverse= inverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("the inverse is" + inverse);
    }
}
