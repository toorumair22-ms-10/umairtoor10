package filehandling;

import java.io.*;

public class file {

    public static void main(String[] args) {

        File fileObj = new File("firstfile.txt");

        try {
            fileObj.createNewFile();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileWriter fw = new FileWriter(fileObj, true);
            fw.write("HEY how are you");
            fw.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}