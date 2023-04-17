package day29_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White");

        Cat cat = new Cat();
        cat.setInfo("Lapa","stray",'M',2,"medium","black");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal", 'M',5,"Large","Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-------------------------------------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("-------------------------------------------------------------");

        dog.bark();

        cat.meow();

        tiger.hunt();

        System.out.println("-------------------------------------------------------------");

        /*
        System.out.println(dog.name);
        System.out.println(dog.color);
        dog.gender = 'K';
        dog.age = -100;
*/


        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);

    }

}
