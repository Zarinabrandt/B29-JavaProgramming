package day35_polymorphism;

import day31_Inheritance.shape_MethodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstruaction.animalTask.*;
import day34_abstruaction.carTask.Audi;
import day34_abstruaction.carTask.Honda;
import day34_abstruaction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

       Dog dog = new Dog("Max","Husky",'M',4,"Small","White");

       Cat cat = new Cat("Lapa","Black cat",'M',3,"Small","Black");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;

        Animal[] animals = {dog, cat, tiger, lion,eagle, parrot, dolphin, shark, duck};

        Animal animal = new Dog("Max","Husky",'M',4,"Small","White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //animal.play();
        //animal.bark();

        System.out.println("--------------------------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);


     Honda honda = new Honda("Pilot","Black",2019,35000);
     Audi audi = new Audi("Q6","Silver",2020,36000);
     Tesla tesla = new Tesla("Model Y","Blue",2022,60000);

     Teacher teacher = new Teacher("James",45, 'M',"A1"," math teacher", 75000);

     Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

     Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

     Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);



     Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver, tester};

     System.out.println(Arrays.toString(objects));

     Object[] employees = {teacher,developer,driver,tester};

     Employee obj = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

     obj.work();







    }

}
