package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);

        System.out.println(list1);

        System.out.println("---------------------------------------------");

        ArrayList<Integer> score = new ArrayList<>();

        score.addAll( Arrays.asList(75, 85, 95, 70, 80) ); //asList Returns a fixed-size list backed by the specified array.

        System.out.println(score);


        System.out.println("----------------------------------------------------");


        ArrayList<String> students = new ArrayList<>();
        students.addAll( Arrays.asList("Gadir", "Hasan", "Adil", "Bilal") );

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Samir", "Tatiana"));

        System.out.println(students);


        System.out.println("----------------------------------------------------");

        //int[] nums = {1,2,3,4,5,6,7,8}; //has to be non-primitive data type and needs to be wrapper class

        Integer[] nums = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums) ); //this is another way

        //l1.addAll(Arrays.asList(nums)); // this is one way


        System.out.println(l1);


        System.out.println("----------------------------------------------------");


        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Muhtar", "Zarina", "Ali") );

        System.out.println(employeeList);

        boolean hasAlena = employeeList.contains("Alena");

        boolean hasAlenaMuhtar = employeeList.containsAll( Arrays.asList("Alena","Muhtar") );

        boolean hasZarinaMuhtarKuzat = employeeList.containsAll(Arrays.asList("Zarina","Muhtar","Kuzat"));

        System.out.println("hasAlena = " + hasAlena); //true
        System.out.println("hasAlenaMuhtar = " + hasAlenaMuhtar); //true
        System.out.println("hasZarinaMuhtarKuzat = " + hasZarinaMuhtarKuzat); //false


        System.out.println("----------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20) );

        list.removeAll(Arrays.asList(10, 20) );

        System.out.println(list);


        System.out.println("----------------------------------------------------");


        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Zarina", "Ali", "Khashavar", "Madiar", " Muhtar", "Muhtar", "Alena", "Khashavar") );

        developers.retainAll(Arrays.asList("Alena","Khashavar", "Muhtar") ); //Retains only the elements in this list that are contained in the specified collection. In other words, removes from this list all of its elements that are not contained in the specified collection. Will remove all un-matching elements/objects

        System.out.println(developers);


        System.out.println("----------------------------------------------------");


        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs","Potato", "Milk","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towel"));

        groceriesList.retainAll(Arrays.asList( "Eggs","Potato", "Milk","Tomato" ) ); //one way

        //groceriesList.removeAll(Arrays.asList( "Rice","Orange","Strawberry","Blueberry","Paper towel" )); //another way

        System.out.println(groceriesList);









    }
}
