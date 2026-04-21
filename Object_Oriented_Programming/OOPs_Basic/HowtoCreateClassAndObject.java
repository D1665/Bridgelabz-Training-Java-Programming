package Object_Oriented_Programming.OOPs_Basic;


public class HowtoCreateClassAndObject {
    //data:data members: instance variable
    int studentid;
    String studentname;
    String studentcity;

    //behaviour: member methods : methods : (functions)
    public void showfulldetaile(){
        System.out.println("name is "+studentname);
        System.out.println("id is "+studentid);
        System.out.println("city is "+studentcity);
    }
    public static void main(String[] args) {

        //now creating object of HowtoCreateClassAndObject 
        HowtoCreateClassAndObject student1=new HowtoCreateClassAndObject();
        student1.studentid=5;
        student1.studentname="Dinesh Sirsiya";
        student1.studentcity="Aligarh";
        student1.showfulldetaile();
    }
}
