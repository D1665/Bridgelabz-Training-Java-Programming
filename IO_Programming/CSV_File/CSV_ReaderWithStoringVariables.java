package IO_Programming.CSV_File;
import java.io.*;

public class CSV_ReaderWithStoringVariables {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("IO_Programming/student.csv"));

            br.readLine(); // skip header

            String line;

            while((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id =
                        Integer.parseInt(data[0]);

                String name =
                        data[1];

                int age =
                        Integer.parseInt(data[2]);

                System.out.println(
                        id + " " +
                        name + " " +
                        age);
            }

            br.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
