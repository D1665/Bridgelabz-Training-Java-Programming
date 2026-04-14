import java.util.*;
public class StudentVoting {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    int studentsage[]=new int[10];
    for(int i=0;i<studentsage.length;i++){
        System.out.println("Enter the age of student"+i);
        studentsage[i]=sc.nextInt();
    }
    for(int i=0;i<studentsage.length;i++){
        if(studentsage[i]>=18){
            System.out.println(i+"Student is eligible for voting");   
        }
        else{
            System.out.println(i+"Student is not eligible for voting");
        }
    }
}}
