package DataStructureandAlgorithm.review.Review;
import java.util.*;
public class wildcard {

    static void student (List<? super Integer> l){
        System.out.println(l);
    }

    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>();
        List<Double>l2=new ArrayList<>();
        List<Number>l3=new ArrayList<>();
        student(l1);
        student(l3);
        // student(l2);
        

        
    }
    
}
