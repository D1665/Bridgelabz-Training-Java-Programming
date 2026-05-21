package CollectionsFramework.Collection;
import java.util.*;
import java.util.Collections;
public class ListConcept {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
    list.add(50);
    list.add(90);
    list.add(58);
    System.out.println(list.get(1));
    
    list.remove(1);

    var linkedlist=new LinkedList<Integer>();
    linkedlist.add(9);
    linkedlist.addFirst(68);
    List<Integer>stack=new Stack<>();
    List<Integer>vector=new Vector<>();
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);


    Iterator<Integer>it=list.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
        if(it.next()>10){
            it.remove();
        }
    }

    
    }


}
