package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

        // groceriesList[2] = "Oranges";

        groceriesList.set(2, "Oranges"); //Replaces the element at the specified position in this list with the specified element.

        System.out.println(groceriesList);

        groceriesList.add(2, "Cookies"); //Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).

        System.out.println(groceriesList);


        System.out.println("------------------------------------------------------------");


        //remove element

        groceriesList.remove(0); //Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).

        System.out.println(groceriesList);

        // two ways to remove the object by index and object


        groceriesList.remove("Paper Towels"); //will look for same element(object) as "Paper Towels" and will remove it from the list, removes only one object

        System.out.println(groceriesList);


        System.out.println("----------------------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4

        //numbers.remove(20); // IndexOutOfBoundsException , we do not have index 20



        //numbers.remove(Integer.valueOf(10) ); //now it can remove an object
        boolean r1 = numbers.remove(Integer.valueOf(10) ); //now it can remove an object and gives true or false value

        System.out.println(numbers);
        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("----------------------------------------------------------------");


        ArrayList<String> names = new ArrayList<>();

        names.add("Marina"); //0
        names.add("Marina"); //1
        names.add("Arina"); //2
        names.add("Arina"); //3
        names.add("Inna"); //4
        names.add("Arina"); //5

        System.out.println(  names.indexOf("Marina")  ); //0
        System.out.println(  names.lastIndexOf("Marina")  ); //1

        System.out.println(  names.lastIndexOf("Arina")  ); //5






    }
}