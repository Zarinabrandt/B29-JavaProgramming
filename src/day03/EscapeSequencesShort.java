package day03;

public class EscapeSequencesShort {

    public static void main(String[] args) {

        // new line: |n
        System.out.println("Hello World\nHelloCydeo");

        // horizontal tab: \t
        System.out.println("\tJava Programming Language");

        //backslash: \\
        System.out.println("\\");

        // double quote: \"
        System.out.println("I like \"Wooden Spoon\"");


    }


    public static class PrimitiveDataTypes1Short {

        public static void main(String[] args) {

            /*
            Declaring a Variable:
                    DataType variableName = Data;
             */

            byte age = 15;
            short year = 2023;
            int salary = 100000;
            long number = 999999999l;

            System.out.println(age);
            System.out.println(year);
            System.out.println(salary);
            System.out.println(number);

        }

        public static class PrimitiveDataTypes2 {

            public static void main(String[] args) {

                /*
                Declaring a Variable:
                     DataType variableName = Data;
                 */

                double number1 = 3.5;
                float number2 = 2.5f;

                System.out.println(number1);
                System.out.println(number2);



            }

        }

        public static class PrimitiveDataTypes3 {

            public static void main(String[] args) {

                /*
                Declaring a Variable:
                     DataType variableName = Data;
                 */

                char ch = 'M';
                int ch1 = 'M';
                char ch3 = 45000;
                char ch4 = 65000;
                char ch5 = 47000;

                System.out.println(ch);
                System.out.println(ch1);
                System.out.println(ch3);
                System.out.println(ch4);
                System.out.println(ch5);

            }

        }

        public static class PrimitiveDataTypes4 {

            public static void main(String[] args) {

                /*
                Declaring a Variable:
                         DataType variableName = Data;
                 */

                boolean result = 10 < 20;

                System.out.println(result);

            }

        }

        public static class VariableNamingRules {

            public static void main(String[] args) {

                int age = 19;

                System.out.println(age);

                double stateTax = 5.6;

                System.out.println(stateTax);

                double federal_tax = 28.5;

                System.out.println(federal_tax);



            }

        }
    }
}
