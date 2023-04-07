package day25_Constructors;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Marina",30,'F',"Java developer",120000, LocalDate.of(2022,12,2));

        Employee employee2 = new Employee("Arina",38,'F',"SDET",120000, LocalDate.of(2022,5,2));




        System.out.println(employee1);
        System.out.println(employee2);

    }
}
