package com.json.tutorial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentToDB {
    public static boolean insertStudentToDB(Student st){
        boolean f=false;
        try{
            Connection cp =CP.createCon();
            String q="insert into student(student_id,name,age,email) values(?,?,?,?)";
            //prepared statement
            PreparedStatement psmt=cp.prepareStatement(q);
            //set values of parameter
            psmt.setInt(1,st.getStudentId());
            psmt.setString(2,st.getStudentName());
            psmt.setInt(3,st.getStudentAge());
            psmt.setString(4,st.getStudentEmail());

            //execute
            psmt.executeUpdate();
            f=true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return f;
    }

    public static boolean deleteStudentToDB(int userId) {
        boolean f=false;
        try{
            Connection cp =CP.createCon();
            String q="delete from student where student_id=?";
            //prepared statement
            PreparedStatement psmt=cp.prepareStatement(q);
            //set values of parameter
            psmt.setInt(1,userId);

            //execute
            psmt.executeUpdate();
            f=true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return f;
    }

    public static void showAllStudent() {

        try{
            Connection cp =CP.createCon();
            String q="select * from student;";
            Statement stmt=cp.createStatement();

            ResultSet set=stmt.executeQuery(q);

            while (set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);
                int age=set.getInt(3);
                String email=set.getString(4);

                System.out.println("Student id: "+id);
                System.out.println("Student name: "+name);
                System.out.println("Student age: "+age);
                System.out.println("Student email: "+email);
                System.out.println("----------------------------");
            }




        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
