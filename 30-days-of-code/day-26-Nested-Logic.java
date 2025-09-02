import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Solution {
    
    
    
    static class BookRent {
        
        static int PER_DAY_SAME_MONTH_FINE = 15;
        static int PER_DAY_FUTURE_MONTH_FINE = 500;
        static int FIXED_FUTURE_YEAR_FINE = 10000;
        
        
        LocalDate returnedDate;
        LocalDate dueDate;
        
        BookRent(LocalDate returnedDate, LocalDate dueDate) {
            this.returnedDate = returnedDate;
            this.dueDate = dueDate;
        }
        
        int getFine() {
            int daysBetween = (int) ChronoUnit.DAYS.between(dueDate, returnedDate);
            if (daysBetween <= 0) return 0;
            
            if (returnedDate.getYear() > dueDate.getYear()) {
                return FIXED_FUTURE_YEAR_FINE;
            }
            
            if (returnedDate.getMonthValue() > dueDate.getMonthValue()) {
                int monthsBetween = daysBetween / 30;
                return monthsBetween * PER_DAY_FUTURE_MONTH_FINE;    
            }
            
            if (returnedDate.getDayOfMonth() > dueDate.getDayOfMonth()) {
                return daysBetween * PER_DAY_SAME_MONTH_FINE;
            }
            
            
            return 0;
        }
    }
    
    static class DateConverter {
        
        static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd MM yyyy");

        
        static LocalDate getDateFromString(String date) {

            date = padDate(date);

            return LocalDate.parse(date, DATE_TIME_FORMATTER);
        }
        
        static String padDate(String date) {
            String[] splitedDate = date.split(" ");
            
            
            String day = splitedDate[0];
            String month = splitedDate[1];
            String year = splitedDate[2];
            
            String paddedDay = String.format("%02d", Integer.parseInt(day));
            String paddedMonth = String.format("%02d", Integer.parseInt(month));
            String paddedYear = String.format("%04d", Integer.parseInt(year));
            
            return paddedDay + " " + paddedMonth + " " + paddedYear;
        }
        
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String returnedDateInput = sc.nextLine();
        String dueDateInput = sc.nextLine();

        
        
        LocalDate returnedDate = DateConverter.getDateFromString(returnedDateInput);
        LocalDate dueDate = DateConverter.getDateFromString(dueDateInput);
        
        BookRent bookRent = new BookRent(returnedDate, dueDate);
        
        
        System.out.println(bookRent.getFine());
        
        sc.close();
    }
}