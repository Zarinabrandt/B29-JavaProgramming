package day24_JavaDateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Kiril", 'M', LocalDate.of(1949, 2, 25));
        people[1].setInfo("Danil",'M', LocalDate.of(1987, 12, 15));
        people[2].setInfo("Zarina",'F',LocalDate.of(1983,9,10));
        people[3].setInfo("Inna",'F',LocalDate.of(1981, 10, 9));
        people[4].setInfo("Zackar",'M',LocalDate.of(2024, 8,15));


        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people ));

        studentList.removeIf(p -> p.age < 55);

        System.out.println(studentList);




    }
}
