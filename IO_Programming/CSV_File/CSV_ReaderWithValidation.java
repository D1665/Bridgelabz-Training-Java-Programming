package IO_Programming.CSV_File;

import java.io.*;

public class CSV_ReaderWithValidation {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("IO_Programming/student.csv"));

            br.readLine(); // Skip Header

            String line;

            while((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id =
                        Integer.parseInt(data[0]);

                String name =
                        data[1];

                int age =
                        Integer.parseInt(data[2]);

                if(id <= 0) {
                    System.out.println("Invalid ID");
                    continue;
                }

                if(name.isEmpty()) {
                    System.out.println("Invalid Name");
                    continue;
                }

                if(age < 0) {
                    System.out.println("Invalid Age");
                    continue;
                }

                System.out.println(
                        "Valid Record: "
                        + id + " "
                        + name + " "
                        + age);
            }

            br.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}