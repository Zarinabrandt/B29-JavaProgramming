package day27_AccessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }


    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();


    }

}
