package day27_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;
/*
    {  // instance initialization block better to use for default values
        name = "James";
        age = 20;
    }

 */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        /*
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.name);

         */

       InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 26);
       InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron", 28);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }



}
