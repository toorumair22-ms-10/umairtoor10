package FILE_HANDLING;
import java.io.*;
import java.io.IOException;
import java.util.*;
public class FILEHANDLING {

    public static void main(String[] args) {
        File file_pointer = new File("myfirstfile.txt");
        try {
            if (file_pointer.createNewFile()) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter file_pointer1 = new FileWriter("myfirstfile.txt", true);
            file_pointer1.write("HEY how are you");
            file_pointer1.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
