package day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();  // Array Based Class ===> get() is faster

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        List<Integer> linkedList = new LinkedList<>(); // Note Based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are fast

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("----------------------------------------------------------------");




    }

}
