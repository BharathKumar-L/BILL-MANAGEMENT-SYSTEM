
package gstbilling.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFill {
    private static String date1,month,year;

    public static String getDate1() {
       
        return date1;
    }

    public static void setDate1(String date1) {
        DateFill.date1 = date1;
    }

    public static String getMonth() {
        return month;
    }

    public static void setMonth(String month) {
        DateFill.month = month;
    }

    public static String getYear() {
        return year;
    }

    public static void setYear(String year) {
        DateFill.year = year;
    }
    
    public void fill() {
    Date dd = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
    String formattedDate = sdf.format(dd);
    String[] parts = formattedDate.split(" "); 
    DateFill.date1 = parts[0];
    DateFill.month = parts[1];
    DateFill.year = parts[2];
  }
    
    
}
