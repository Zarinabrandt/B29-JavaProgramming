package day31_Inheritance.animal_MethodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Lapa","Bangle",'M',2,"middle","Black");

        Dog dog = new Dog("Umi","Cattledog", 'F',1,"Middle","White");

        Lion lion = new Lion("Simbe","African Lion",'M',6,"Large","Yellow",true);

        Eagle eagle = new Eagle("Bella","American Eagle",'F',4,"Medium","Black & White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("------------------------------------------------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        System.out.println();

        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();


    }
}
