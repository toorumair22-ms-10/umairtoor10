import java.util.Scanner;
class savingaccount{
    double currentbalance=0;
    public void deposit(double amount){
        currentbalance += amount;
    }
    public void withdraw(double amount){
        if (amount <= currentbalance){
            currentbalance -= amount;
        }else{
            System.out.println("you have insufficient balance");
        }
    }
    public void showbalance(){
        System.out.println("your current balance is" + currentbalance);
    }
}
public class bank{
    public static void main(String[] args){
        savingaccount s1= new savingaccount();
        Scanner sc= new Scanner(System.in);
        int choice = 0;
        while (choice != 4){
            System.out.println(1 +" " + "deposit money");
            System.out.println(2 + " " +  "withdraw money");
            System.out.println(3 + " " + "show balance");
            System.out.println(4 + " " + "exit");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("how much amount to deposit");
                    double depositamount= sc.nextDouble();
                    s1.deposit(depositamount);
                    break;
                case 2:
                    System.out.println("how much amount to withdraw");
                    double withdrawamount= sc.nextDouble();
                    s1.withdraw(withdrawamount);
                    break;
                case 3:
                    s1.showbalance();
                case 4:
                    System.out.println("you have exit");
                    break;


            }



        }
    }
}





