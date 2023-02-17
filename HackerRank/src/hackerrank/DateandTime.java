
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateandTime {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);

        
        System.out.println("month:");
        String month = in.next();
        
        System.out.println("day:");
        String day = in.next();
        
        System.out.println("year:");
        String year = in.next();
        
        String input_date = day + "/" + month + "/" + year;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(input_date);
        
        Date d = new Date((Integer.parseInt(year) - 1900),Integer.parseInt(month) - 1,Integer.parseInt(day));
       // System.out.println(d + " " + d.getDay());
        switch(d.getDay()){
            case 0 -> System.out.println("SUNDAY");
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
        }
        
    
    }
}
    
