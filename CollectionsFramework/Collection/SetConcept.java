package CollectionsFramework.Collection;

import java.util.HashSet;
import java.util.*;

public class SetConcept {

    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(8);
        hs.add(8);
        hs.add(9);
        hs.add(9);
        hs.add(17);
        hs.add(11);
        for(Integer i:hs){
            System.out.println(i);
        }
        Set<Integer>ts=new TreeSet<>();
        ts.add(8);
        ts.add(8);
        ts.add(9);
        ts.add(9);
        ts.add(17);
        ts.add(11);
        for(Integer i:ts){
            System.out.println(i);
        }
        LinkedHashSet<Integer>ls=new LinkedHashSet<>();
        
    }

    
}
