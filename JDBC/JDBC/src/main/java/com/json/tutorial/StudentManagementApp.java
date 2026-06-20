package com.json.tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentManagementApp {

    public static void main(String [] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("PRESS 3 to display student");
            System.out.println("PRESS 4 to exti app");
            int c = Integer.parseInt(br.readLine());

            if(c==1)
            {
                //add student..
                System.out.println("Enter User id: ");
                int id= Integer.parseInt(br.readLine());
                System.out.println("Enter User Name: ");
                String name= br.readLine();
                System.out.println("Enter User Age: ");
                int age=Integer.parseInt(br.readLine());
                System.out.println("Enter User Email");
                String email= br.readLine();

                //create student object to store student
                Student st=new Student(id,name,age,email);
                boolean ans=StudentToDB.insertStudentToDB(st);
                if(ans){
                    System.out.println("Student is added successfully");
                }
                else{
                    System.out.println("Something went wrong try again");
                }

            }else if(c==2)
            {
                //delete student
                System.out.println("Enter User id: ");
                int userId= Integer.parseInt(br.readLine());
                boolean res=StudentToDB.deleteStudentToDB(userId);
                if(res){
                    System.out.println("Student is deleted successfully");
                }
                else{
                    System.out.println("Something went wrong try again");
                }

            }else if(c==3)
            {
                //display students..
                StudentToDB.showAllStudent();
            }else if(c==4)
            {
                //exit
                break;
            }
        }
        System.out.println("Thank you for using my app! ");
        System.out.println("See you again");
    }
}
