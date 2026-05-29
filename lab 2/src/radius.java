import java.util.Scanner;
public class radius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("the area is" + area);
        int ar = (int) area;
        System.out.println("the area in whole number is" + ar);


    }
}
