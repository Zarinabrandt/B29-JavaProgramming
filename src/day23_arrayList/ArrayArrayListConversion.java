package day23_arrayList;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

        String[] arr = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList( arr ) );

        System.out.println(list);


        System.out.println("-----------------------------------------------------");


        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        String[] language = list2.toArray(new String[ 0 ]); // toArray - Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array. If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.

        System.out.println(Arrays.asList(language));


        System.out.println("---------------------------------------------------------");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Integer[] n = nums.toArray(new Integer[0]);
        //int[] n = nums.toArray(new Integer[0]); //better not to consider primitive types


        System.out.println(Arrays.toString(n));

        System.out.println("-----------------------------------------------------------");

        //quiz
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        //int a = 1;
        Integer a = 1;
        list3.remove(a);

        System.out.println(list3);

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3, "cyan");

        System.out.println(colors);

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.set(0, list5.get(4));
        list5.set(4, list5.get(0));

        System.out.println(list5); //indexOutOfBound

        System.out.println("-----------------------------------------------------------");






    }
}
