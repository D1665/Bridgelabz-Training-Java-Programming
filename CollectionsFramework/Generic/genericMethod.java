package CollectionsFramework.Generic;

public class genericMethod {

    static  <T> T student( T name){
        return name;
    }
    public static void main(String[] args) {
        System.out.println(student("Dinesh Sirsiya"));

    }
}
