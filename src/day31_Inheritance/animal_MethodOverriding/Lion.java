package day31_Inheritance.animal_MethodOverriding;

public class Lion extends Animal{


    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating deer");
    }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }

}
