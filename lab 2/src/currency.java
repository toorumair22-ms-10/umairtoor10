import java.util.Scanner;
public class currency {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the currency");
        int currency = sc.nextInt();
        switch (currency){
            case 1:
                String usd = "united states dollar";
                System.out.println(usd);
                break;
            case 2:
                String gbp = "british pound";
                System.out.println(gbp);
                break;
            case 3:
                String eur = "euro";
                System.out.println(eur);
                break;

            default:
                System.out.println("invalid currency");

        }



    }
}
