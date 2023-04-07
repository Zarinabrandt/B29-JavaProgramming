package day25_Constructors;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person p1 = new Person("Alina",25,'F', LocalDate.of(1998,05,5), true, true);

        p1.sleep();
        p1.drink("water");
        p1.eat("Burger");
        System.out.println(p1);


    }
}
