package day27_AccessModifiers;

public class Test {
    public static void main(String[] args) {

        new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("-------------------------------------------------------------");

        System.out.println(AccessModifiers.publicData); // public is accessible within same package

        System.out.println(AccessModifiers.protectedData); // protected is accessible within same package

        System.out.println(AccessModifiers.defaultData); // default is accessible within same class and package

        //System.out.println(AccessModifiers.privateData); // private is NOT accessible within same package

        // new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();



    }
}
