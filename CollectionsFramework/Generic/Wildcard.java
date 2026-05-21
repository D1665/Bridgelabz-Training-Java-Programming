package CollectionsFramework.Generic;
import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    //upper bound 
    static void details(List<? extends Number> list){
        System.out.println(list);

    }
    //lower bound
    static void details1(List<? super Integer> list){
        System.out.println(list);

    }
     public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        List<Number> list3=new ArrayList<>();
        details(list3);
        // details(list2);
        details1(list3);
        // details(list2);


        
     }
}
