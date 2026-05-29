import java.util.Scanner;
class calculate{
    double monthly_salary;
    double portion_saved;
    double total_cost;
    double portion_down_payment= 0.25;
    double r = 0.04;
    double current_savings = 0;
    int months= 0;

}
public class calculator {
    public static void main(String[] args){
        calculate c1= new calculate();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter monthly salary: ");
        c1.monthly_salary = sc.nextDouble();
        System.out.print("Enter portion saved: ");
        c1.portion_saved= sc.nextDouble();
        System.out.print("Enter total cost: ");
        c1.total_cost = sc.nextDouble();
        double down_payment = c1.total_cost * c1.portion_down_payment;
        while(c1.current_savings< down_payment){
            c1.current_savings += c1.current_savings * c1.r / 12;
            c1.current_savings += c1.monthly_salary * c1.portion_saved;
            c1.months++;

        }

        System.out.println("months needed" + " " + c1.months);
    }
}
