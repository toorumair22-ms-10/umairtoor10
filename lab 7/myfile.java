package FILE_HANDLING;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class myfile {
    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("Book11.csv");
        Scanner read=new Scanner(file);
        read.nextLine();
        while(read.hasNextLine()){
            String data[]=read.nextLine().split(",");

            //System.out.println(read.nextLine());
            String name=data[0];
            String roll=data[1];
            Double marks=Double.parseDouble(data[2]);
            System.out.println(name);
            System.out.println(roll);
            System.out.println(marks);


        }

    }
}
