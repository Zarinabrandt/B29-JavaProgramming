package day10_Scanner_String_intro;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class Read_files_with_scanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_Scanner_String_intro/Test.txt"));

        /*
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

         */
        /*
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
         */

        System.out.println(  scan.hasNextLine());


        scan.close();

    }
}
