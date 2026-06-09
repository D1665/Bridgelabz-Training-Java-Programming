package Java8features.Stream_Apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1,2,3,4,5,6);
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        List<Integer> list3=Arrays.asList(1,2,3,4,5,6);


        //create Even list without stream 

        List<Integer> listeven=new ArrayList<>();
        for (Integer i : list1) {
            if(i%2==0){
                listeven.add(i);
            }
            
        }
        System.out.println(list1);
        System.out.println(listeven);


        //create Even list using stream

        Stream<Integer> stream=list1.stream();
        List<Integer>newEvenlist=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(newEvenlist);


        // or we can write 
        List<Integer>newEvenlist2=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(newEvenlist2);

        
    }
}
