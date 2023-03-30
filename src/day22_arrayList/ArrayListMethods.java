package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(10); //3

        //list.add(5.5);



        System.out.println(list);

        list.add(1, 15); //adding index //10, 15, 20, 30, 10 will be shifted to the right

        System.out.println(list);

        list.add(2, 25); //10, 15, 25, 20, 30, 10

        System.out.println(list);

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mamoa");
        studentsList.add("Jason");
        studentsList.add("Momad");
        studentsList.add("Mamur");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);
        String lastStudent = studentsList.get(studentsList.size() -1 );

        System.out.println(firstStudent);
        System.out.println(lastStudent);

        System.out.println("-----------------------------------------------------------");







    }
}
