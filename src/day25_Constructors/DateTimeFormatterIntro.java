package day25_Constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM dd y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df)); //July-01-22 //2022/Jul/1, Fri //Friday, 07 01 2022


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm a");

        LocalTime time1 = LocalTime.of(17,30);

        System.out.println(time1.format(tf)); //07:05 //7:5 //5:05 //5:30 PM


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf)); //04/06/2023 12:44 PM  //Thursday, 04/06/2023 12:45 PM //Thursday, Apr/06/2023 12:46 PM


    }
}
