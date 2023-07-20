// This file will write to the file specified
import  java.io.FileWriter; // This class will write something to the file
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("chores.txt", true);
            myWriter.write("Dishwasher\nHoovering\nBedroom\nBathroom\nStairs"); // method to write
            myWriter.write("Dishwasher\nHoovering\nBedroom\nBathroom\nStairs");
            myWriter.close(); // this method to close the file and finish writing
            System.out.println("Successfully written to file.");
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
