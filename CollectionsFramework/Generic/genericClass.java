package CollectionsFramework.Generic;

class Student<T>{
    T name;
    T collegeName;
    Student(T name,T collegeName){
        this.name=name;
        this.collegeName=collegeName;
    }
    T studentname(){
        return name;
    }
}
public class genericClass {
    public static void main(String[] args) {
        Student<String> st1=new Student<>("Dinesh Sirsiya", "GLA University Mathura");
        System.out.println(st1.studentname());
    }
    
}
