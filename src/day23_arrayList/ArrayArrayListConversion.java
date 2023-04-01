package day23_arrayList;

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








    }
}
