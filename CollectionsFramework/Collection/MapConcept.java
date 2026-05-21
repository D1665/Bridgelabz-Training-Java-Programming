package CollectionsFramework.Collection;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class MapConcept {


    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        LinkedHashMap<Integer,Integer>lm=new LinkedHashMap<>();
        tm.put(5,6);
        tm.put(4,6);
        tm.put(4,7);
        tm.put(6,6);
        tm.put(2,6);
        tm.put(1,6);
        // tm.put(null,null);
        for (Integer i : tm.keySet()) {
            System.out.println(i+"->"+tm.get(i));
        }
        for (Integer i : tm.values()) {
            System.out.println(i);
        }
      
        
         
    }

    
}
