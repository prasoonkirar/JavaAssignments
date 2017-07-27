package JavaAssignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * A class containing a method which takes a input string and then
 * further divide it into date month calender and then return the prints
 * KYC filling range of dates.
 * Created by Prasoon on 25/7/17.
 */
public class RangeKYC {

    /**
     * A method taking a String as an argument and printing the range
     * of dates for KYC form in format    dd-mm-yyyy dd-mm-yyyy
     * @param str
     */
    public void printRangeKYC(String str) {

        try {

            String[] parts = str.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];

            parts = part1.split("-");
            int day1 = Integer.parseInt(parts[0]);
            int month1 = Integer.parseInt(parts[1]);
            int year1 = Integer.parseInt(parts[2]);

            parts = part2.split("-");
            int day2 = Integer.parseInt(parts[0]);
            int month2 = Integer.parseInt(parts[1]);
            int year2 = Integer.parseInt(parts[2]);

            if (day1 > 31 || day2 > 31 || month1 > 12 || month2 > 12 || day1 < 1 || day2 < 1 || month1 < 1 || month2 < 1 || year1 < 1 || year2 < 1) {
                throw new WrongInputException("Wrong input!!! no such date exists");
            }

            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            Calendar cal3 = Calendar.getInstance();
            Calendar cal4 = Calendar.getInstance();
            Calendar cal5 = Calendar.getInstance();

            cal1.set(year1, month1 - 1, day1);
            cal2.set(year2, month2 - 1, day2);
            cal3.set(year2, month1 - 1, day1);
            cal4.set(year2, month1 - 1, day1);
            cal4.add(cal4.DATE, -30);
            cal5.set(year2, month1 - 1, day1);
            cal5.add(cal5.DATE, 30);

            int flag = cal2.compareTo(cal3);

            int flag1 = cal2.compareTo(cal1);

            if (flag1 == -1) {
                System.out.println("No range");
            } else {
                SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");

                if (flag == 0) {
                    String formatted1 = format1.format(cal4.getTime());
                    System.out.print(formatted1);
                    String formatted2 = format1.format(cal3.getTime());
                    System.out.println(" " + formatted2);
                } else if (flag == -1) {
                    int flag2 = cal2.compareTo(cal4);
                    if (flag2 == -1) {
                        cal4.add(cal4.YEAR, -1);
                        cal5.add(cal5.YEAR, -1);
                        String formatted1 = format1.format(cal4.getTime());
                        System.out.print(formatted1);
                        String formatted2 = format1.format(cal5.getTime());
                        System.out.println(" " + formatted2);
                    } else {
                        String formatted1 = format1.format(cal4.getTime());
                        System.out.print(formatted1);
                        String formatted2 = format1.format(cal2.getTime());
                        System.out.println(" " + formatted2);
                    }
                } else {
                    int flag3 = cal2.compareTo(cal5);
                    if (flag3 == 1) {
                        String formatted1 = format1.format(cal4.getTime());
                        System.out.print(formatted1);
                        String formatted2 = format1.format(cal5.getTime());
                        System.out.println(" " + formatted2);
                    } else {
                        String formatted1 = format1.format(cal4.getTime());
                        System.out.print(formatted1);
                        String formatted2 = format1.format(cal2.getTime());
                        System.out.println(" " + formatted2);
                    }
                }
            }
        } catch (Exception m) {
            System.out.println("Error !!!" +m);
        }
    }
}
