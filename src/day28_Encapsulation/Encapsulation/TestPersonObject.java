package day28_Encapsulation.Encapsulation;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Albina",40,'F', LocalDate.of(1982,02,3));

        System.out.println(person1);



    }
}
