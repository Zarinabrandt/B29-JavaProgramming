package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255);

        //numbers.add(300, 2000); //IndexOutOfBoundsException // because we do Not have assign those elements till 300

        System.out.println(numbers); //100, 200, 300, 255, 400, 500

        System.out.println("-------------------------------------------------------");

        //one way
        for (int i = 0; i < numbers.size(); i++){ //for
            int each = numbers.get(i);
            System.out.println(each);
        }

        System.out.println("-------------------------------------------------------");

        //second way
        for (int i = 0; i < numbers.size(); i++) { //numbers.fori shortcut for get for loop
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------------------");


        for (int i = numbers.size() - 1; i >= 0; i--) { //numbers.forr starting from last number
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------------------");

        for (Integer each : numbers) { //numbers.for, for each loop
            System.out.println(each);
        }



    }
}
