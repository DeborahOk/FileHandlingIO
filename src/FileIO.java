// This program will create a text
import java.io.File; // class to create a file
import java.io.IOException; // class to handle error
public class FileIO {
    public static void main(String[] args) {
        try { //create the file inside this body
            File myObj = new File("chores.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created, the name of your file is " + myObj.getName());
            } else {
                System.out.println("Failed to create the file. File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
