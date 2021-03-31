package homework1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        tlValuesOfExchange tl1 = new tlValuesOfExchange(7.40, 6.00);
        Date date_tl1 = new Date();
        DateFormat format_tl = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date_tl1 = format_tl.parse("16-10-2020");
        } catch ( ParseException e ) {
            System.out.println("error");
        }
        tlValuesOfExchange tl2 = new tlValuesOfExchange(8.00, 7.50);
        Date date_tl2 = new Date();
        DateFormat format_tl2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date_tl2 = format_tl2.parse("13-11-2020");
        } catch ( ParseException e ) {
            System.out.println("error");
        }


        System.out.println("at " + date_tl1 + " euro is " + tl1.getEuroValueoftl() + " tl");
        System.out.println("at " + date_tl1 + " dolar is " + tl1.getDolarValueoftl() + " tl");
        System.out.println("at " + date_tl2 + " euro is " + tl2.getEuroValueoftl() + " tl");
        System.out.println("at " + date_tl2 + " dolar is " + tl2.getDolarValueoftl() + " tl");


    }
}
