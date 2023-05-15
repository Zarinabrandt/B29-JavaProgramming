package day36_polymorphism;

import day29_Inheritance.AnimalTask.Animal;
import day29_Inheritance.AnimalTask.Cat;
import day29_Inheritance.AnimalTask.Dog;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        //Dog dog = new Dog();

        //Cat cat = new Cat();

        Animal animal = (Animal) new Dog(); //implicit casting

        System.out.println("-------------------------------------------------------------------");

        Animal animal1 = new Dog(); //upcasting ==> Polymorphism
        animal1.setInfo("Max","Husky",'M',4,"Large","White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        ( (Dog)animal1 ).bark();

        //Dog dog1 = (Dog)animal1; //down casting
        //dog1.bark();

        //( (Cat)animal1 ).scratch(); //Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat

        System.out.println("------------------------------------------------------------------------");

        Phone phone = new Nokia("G10", "Medium", "Black", 99);

        phone.call(911);
        phone.text(1234567789);
        ( (Nokia)phone ).selfDefence();

        //    ( (IPhone)phone ).faceTime(123456); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone

        System.out.println("-------------------------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println( ((Developer) employee).getProgrammingLanguage() );

        //    Driver driver = (Driver) employee;


        System.out.println("-------------------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();
        ((Tesla)electric).selfDrive();
        ( (AutoPilot)electric ).selfDrive();


        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();




    }
}
