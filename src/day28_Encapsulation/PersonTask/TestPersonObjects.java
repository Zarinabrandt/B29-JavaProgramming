package day28_Encapsulation.PersonTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Albina",'F');
        Person person3 = new Person("Hamid",30);
        Person person4 = new Person("Daniel","English");
        Person person5 = new Person("Tatiana", 25,'F');
        Person person6 = new Person("Lucy", 31,'F',"English");

        person4.name = "James";

        //person1.planet = "Mars"; // NOT only person1 planet will be change all the objects will be changed as well

        //Person.planet = "Mars"; // All the object planet will be changed to "Mars"

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlaneName();

        person1.eat("Baklava");

        person2.drink("Water");

        person5.drink("Coffee");

        person6.drink("Tea");



    }
}
