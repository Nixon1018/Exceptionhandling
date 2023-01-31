/*"1. Design a class for a simple database connection pool. The class should have the following features:
        - A private constructor to prevent the class from being instantiated directly.
        - A static method that returns an instance of the class (following the singleton pattern).
        - A method that returns a new connection to the database.
        - A method that closes all open connections and releases them back to the pool.
        2. Design a class for a basic point in 2D space. The class should have the following features:
        - Instance variables for the x and y coordinates of the point.
        - A constructor that allows the user to create a point with given x and y coordinates.
        - An equals method that returns true if the given object is a point with the same x and y coordinates, and false otherwise.
        - A clone method that creates and returns a new point with the same x and y coordinates as the original point.
        3. Design a class for a basic credit card. The class should have the following features:
        - Instance variables for the cardholder's name, card number, and expiration date.
        - A constructor that allows the user to create a credit card with a given name, card number, and expiration date.
        - An equals method that returns true if the given object is a credit card with the same card number, and false otherwise.
        - A clone method that creates and returns a new credit card with the same name, card number, and expiration date as the original credit card."*/
package org.example;
import java.util.logging.Logger;
import java.util.Scanner;
class Card implements Cloneable{
    String holdername;
    int cardnumber;
    String expirationdate;

    Card(String name,int no,String date)
    {
        holdername=name;
        cardnumber=no;
        expirationdate=date;
    }
    String check(double cardnumber)
    {
        return ( this.cardnumber==cardnumber?"true":"false");

    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}


public class Creditcard{
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void main(String[] args) throws CloneNotSupportedException {
        String name;
        int no;
        String date;
        String res;
        Scanner sc = new Scanner(System.in);
        try {
            LOGGER.info("Enter the first cardholdername:");
            name = sc.next();
            LOGGER.info("Enter the first cardnumber:");
            no = sc.nextInt();
            LOGGER.info("Enter the Expiration date:");
            date = sc.next();
            Card c = new Card(name, no, date);
            Card x = (Card) c.clone();
            LOGGER.info("Enter the second cardholdername:");
            x.holdername = sc.next();
            LOGGER.info("Enter the second cardnumber:");
            x.cardnumber = sc.nextInt();
            LOGGER.info("Enter the Expiration date:");
            x.expirationdate = sc.next();
            res = c.check(x.cardnumber);
            String s = "Result: " + res;
            LOGGER.info(s);
        }catch (Exception e)
        {
            String ec = ""+e;
            LOGGER.info(ec);
            sc.nextLine();
        }

    }
}