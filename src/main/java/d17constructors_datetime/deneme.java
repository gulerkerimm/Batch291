package d17constructors_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class deneme {
    public static void main(String[] args) {


        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        System.out.println(myDate.getMonthValue());

        Month month = myDate.getMonth();
        System.out.println(month);

        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfYear());

        int day1= myDate.getDayOfMonth();
        System.out.println(day1);

        DayOfWeek day2 = myDate.getDayOfWeek();
        System.out.println(day2);

        LocalDate newDate = myDate.plusYears(1).plusMonths(2).plusDays(4);
        System.out.println(newDate);

        System.out.println(myDate.minusYears(1).minusMonths(3).minusDays(1));
        LocalDate date1=LocalDate.of(1984,8,3);
        LocalDate date2=LocalDate.of(2010,5,4);
        System.out.println("date1= "+date1 +"  date2= "+date2);

        boolean t1 = date1.isAfter(date2);
        boolean t2 = date1.isBefore(date2);
        System.out.println(t1);
        System.out.println(t2);









    }
}
