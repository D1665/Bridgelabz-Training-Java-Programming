package ExceptionHandling;

import java.io.*;

// Custom unchecked exception for missing file
class FileNotFoundException extends RuntimeException {
    public FileNotFoundException(String filename) {
        super("File not found: '" + filename + "'. Please check the path.");
    }
}

public class FileReaderProgram {

    static void readFile(String filename) {
        File file = new File(filename);

        // Throw custom unchecked exception if file doesn't exist
        if (!file.exists()) {
            throw new FileNotFoundException(filename);
        }

        // Handle checked IOException for file reading operations
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            System.out.println("Reading file: " + filename);
            System.out.println("--- Content ---");
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNum++ + ": " + line);
            }
            System.out.println("--- End of file ---");

        } catch (IOException e) {
            // Checked exception: IO errors during reading
            System.out.println("IO Error while reading: " + e.getMessage());
        }
    }

    static void createSampleFile(String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Hello, this is line 1.");
            bw.newLine();
            bw.write("This is line 2.");
            bw.newLine();
            bw.write("This is line 3.");
        }
    }

    public static void main(String[] args) {
        // Case 1: File exists - read it normally
        try {
            String file = "sample.txt";
            createSampleFile(file);
            readFile(file);
            new File(file).delete();
        } catch (IOException e) {
            System.out.println("Could not create sample file: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        System.out.println();

        // Case 2: File does NOT exist - custom unchecked exception thrown
        try {
            readFile("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
