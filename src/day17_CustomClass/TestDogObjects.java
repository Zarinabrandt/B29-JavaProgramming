package day17_CustomClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Umi";
        dog1.breed = "Unknown";
        dog1.size = "Medium";
        dog1.gender = 'F';
        dog1.age = 1;
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name = "Pepper";
        dog2.breed = "Blue Healer";
        dog2.size = "Over-middle";
        dog2.gender = 'F';
        dog2.age = 12;
        dog2.color = "Black";

        Dog dog3 = new Dog();

        dog3.setInfo("Loki","Husky","Big",'M',5,"Brown");

        Dog dog4 = new Dog();
        dog4.setInfo("Umka", "Golden Retriver", "Small", 'M', 1,"Gray");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();

        dog2.drink();


    }
}
