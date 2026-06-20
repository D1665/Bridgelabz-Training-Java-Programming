package com.json.tutorial;

public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentEmail;

    public Student(int studentId, String studentName, int studentAge, String studentEmail) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
    }

    public Student(String studentName,int studentAge,String studentEmail) {
        super();
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
    }

    public Student() {
        super();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }

}
