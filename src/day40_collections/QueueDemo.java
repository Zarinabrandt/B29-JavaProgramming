package day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue1.addAll(Arrays.asList(null, null, null)); // queue does NOT accept "null"

        System.out.println(queue1); //order of queue will be random

        int num1 = queue1.poll(); // ===> FIFO (first In first Out)

        System.out.println(queue1); // "poll" will remove first elements

        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1); // "poll" will remove first 3 elements

        //  System.out.println(queue1.get(4));

        System.out.println("------------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // keeps insertion order

        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue2.addAll(Arrays.asList(null, null, null)); // queue does NOT accept "null"


        System.out.println(queue2); // will be in same order as in "asList"

        queue2.poll();

        System.out.println(queue2); //will remove first element

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);

        //  System.out.println(queue2.get(3));

        System.out.println("----------------------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); // insertion order, accepts null, has index
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null));

        System.out.println(queue3);

        queue3.poll();

        System.out.println(queue3);


        System.out.println(  ( (LinkedList)queue3).get(4)  );


        System.out.println("----------------------------------------------------");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1));

        System.out.println(list);

        ( (LinkedList)list).poll();

        System.out.println(list);

        // ( (Stack)list ).pop();   // LIFO

        System.out.println(list);



    }
}
