import java.util.*;
public class exam {

    public static void main(String []args){


        PriorityQueue pq = new PriorityQueue();

        pq.add(8);

        pq.poll();

        pq.add(10);

        pq.poll();

        System.out.println(pq.poll());

    }
}
