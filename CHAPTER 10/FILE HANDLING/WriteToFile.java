
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {

    public static void main(String[] args) {
        try {
            try (FileWriter myWriter = new FileWriter("filename.txt")) {
                myWriter.write("File created successfully.");
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
