package CollectionsFramework.Collection;
import java.util.*;
public class QueueConcept {

    public static void main(String[] args) {

        Queue<Integer>ql=new LinkedList<>();
        Queue<Integer>qa=new ArrayDeque<>();
        Queue<Integer>qp=new PriorityQueue<>();
        ql.offer(8585);
        ql.offer(59);
        ql.poll();
        ql.add(9845);
        qa.offer(49);
        qa.offer(59599);
        qp.offer(78);
        qp.offer(89);
        qp.offer(67);
        System.out.println(qa);
        System.out.println(ql);
        System.out.println(qp);
        

        
    }
}