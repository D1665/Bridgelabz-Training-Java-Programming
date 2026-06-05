package IO_Programming.CSV_File;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CSV_WriterAppend {
    public static void main(String[] args) {

    try {
    BufferedWriter bw=new BufferedWriter(new FileWriter("IO_Programming/teacher.csv",true));

    bw.write("id,name,department,salary");
    bw.newLine();
    bw.write("1,dinesh,btech,150000");
    bw.newLine();
    bw.write("2,sirsiya,bca,100000");
    bw.newLine();
    bw.write("3,rahul,polytechnic,5000");
    bw.newLine();
    bw.write("4,aman,bpharma,15000");
    bw.close();

        

    } catch (Exception e) {
        e.printStackTrace();
    }
}}
