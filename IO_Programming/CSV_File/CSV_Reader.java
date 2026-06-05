package IO_Programming.CSV_File;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSV_Reader {
    public static void main(String[] args) {
        try {
            
            BufferedReader br=new BufferedReader(new FileReader("IO_Programming/student.csv"));
            // br.readLine(); // skip header
            String line;
            while((line=br.readLine())!=null){

                String data []=line.split(",");
                for(String value :data){
                    System.out.print(value+" ");
                }
                System.out.println();

            }
            br.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
