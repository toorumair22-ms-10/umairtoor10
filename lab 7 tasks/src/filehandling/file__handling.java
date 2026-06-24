package filehandling;

import java.io.*;
        import java.util.Scanner;

public class file__handling {

    public static void main(String[] args) throws FileNotFoundException {

        File fileObj = new File("Book1.csv");
        Scanner sc = new Scanner(fileObj);

        sc.nextLine(); // Ignore first line

        while (sc.hasNext()) {

            String line = sc.nextLine();
            String details[] = line.split(",");

            String name = details[0];
            String id = details[1];
            Double score = Double.valueOf(details[2]);

            System.out.println(name);
            System.out.println(id);
            System.out.println(score);
        }

        sc.close();
    }
}
