import java.util.Scanner;
public class electricity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the units you consumed");
        int units = sc.nextInt();
        int bill=0;
        if(units<=100){
            bill = units*5;
            
        } else if (units<=200) {

            bill = (units * 5) + (units-100) * 7;

        }else{
            bill=( units * 5)+((units-100) * 7) + ((units-200) * 15);
        }
        System.out.println("the total bill is" + bill);


    }
}
