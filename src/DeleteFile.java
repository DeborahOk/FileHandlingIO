// This will delete the entire file
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("grocery.txt");
        if (myObj.delete()) {
            System.out.println("File " + myObj.getName() + " is deleted");
        } else{
            System.out.println("Failed to delete the file.");
        }
    }
}
