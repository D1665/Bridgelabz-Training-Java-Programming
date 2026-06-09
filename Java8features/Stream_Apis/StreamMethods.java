package Java8features.Stream_Apis;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        
        List<String> names=List.of("Aman","Ankit","Dinesh","Sirsiya");



        //filter(predicate)- use to filter 
             // predicate means boolean value function

             List<String> newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
             System.out.println(newNames);




          //map(function)- we can perform operation on each element

          List<Integer> num=List.of(1,2,3,4,5,6,7,8);
          List<Integer> squNum=num.stream().map(i->i*i).collect(Collectors.toList());
          System.out.println(squNum);


          //foreach()- it gives each element 

          squNum.stream().forEach(
            e-> {
                System.out.println(e);

          });

          names.stream().forEach(System.out::println);


          //sorted

          num.stream().sorted().forEach(System.out::println);

          //min and max
          Integer min=num.stream().min((x,y)->x.compareTo(y)).get();
          Integer max=num.stream().max((x,y)->x.compareTo(y)).get();
          System.out.println("Minimum num is: "+min+" Maximum num is: "+max);
    }



   
}
