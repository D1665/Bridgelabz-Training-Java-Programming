package CollectionsFramework.Generic;
import java.util.List;


//multiple bound 
class Employee<T extends Number& List>{
    T id;
    T rollnum;
    T totalmarks;
    Employee(T id,T rollnum, T totalmarks){
        this.id=id;
        this.rollnum=rollnum;
        this.totalmarks=totalmarks;
    }
    void printdetails(){
        System.out.println(id+" "+rollnum+" "+totalmarks);
    }
}
//upperbound
class Student<T extends Number>{
    T id;
    T rollnum;
    T totalmarks;
    Student(T id,T rollnum, T totalmarks){
        this.id=id;
        this.rollnum=rollnum;
        this.totalmarks=totalmarks;
    }
    void printdetails(){
        System.out.println(id+" "+rollnum+" "+totalmarks);
    }
}

public class boundtype {
    public static void main(String[] args) {
        Student<Integer>s1=new Student<Integer>(25,21 ,87 );
        s1.printdetails();
    }
    
}
