package IO_Programming.CSV_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CSV_Scanner {
    public static void main(String[] args) {
        try {
            
            Scanner fl=new Scanner(new File("IO_Programming/student.csv"));
            while(fl.hasNextLine()){

                String line=fl.nextLine();
                System.out.println(line);

            }
            fl.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
