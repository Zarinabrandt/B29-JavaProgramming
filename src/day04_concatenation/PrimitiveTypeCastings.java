package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        //------ implicit casting --------

        byte a = 15;
        short b = a;
        //short b = (short)a;

        System.out.println(b);

        int c = a; // implicit casting

        long d = 3000L;

        float f = d; // implicit casting


        //------ explicit casting --------

        int x = 100;
        byte y = (byte)x;

        float z = 20.8f;

        short q = (short)z;  // z = 20.8 it will give integer number which is 20

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; // n1 = 2.5;

        System.out.println(n2); // it will give integer number 2

        System.out.println("----------------------------------------------------------");

        int num = 500;

        byte result = (byte) num; // explicit casting

        System.out.println(result); // it will give negative number -12 because byte unable to have 500


        int r = 50000;
        short t = (short) r;

        System.out.println(t); //it will give negative number -15536 because byte unable to have 50000

        System.out.println("----------------------------------------------------------");

        double u = 3000.5;

        int p = (int)u; // explicit casting

        System.out.println(p); // final value will be 3000

        int o = 100;
        double d1 = o; // implicit casting

        System.out.println(d1); // will give 100.0 because it is decimal number





    }

}
