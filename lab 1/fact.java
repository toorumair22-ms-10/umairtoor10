import java.util.Scanner;
public class fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number whose factorial you want to calculate:");
        int num = sc.nextInt();
        System.out.println("you entered" + num);
        int fact = 1;
        for (int i=num;i>0;i--){
            fact=fact*i;

        }
        System.out.println("the factorial of the number you entered is" + fact);
    }

}
