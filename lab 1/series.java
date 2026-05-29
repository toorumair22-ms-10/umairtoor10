import java.util.Scanner;
public class series {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the starting number");
        int start= sc.nextInt();
        System.out.print("enter the ending value");
        int end=sc.nextInt();
        if (start<end){
            for(int i=start; i<=end; i++ ){
                System.out.println(i);
            }
        }else{
            for(int i=start;i>=end;i--){
                System.out.println(i);
            }

        }

    }
}