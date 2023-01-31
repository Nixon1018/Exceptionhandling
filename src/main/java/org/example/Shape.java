package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Shape
{
    Scanner sc= new Scanner (System.in);
    private static final  Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    double length;
    double a;
    double c;
    double height;
    double base;
    double radius;
    double width;
    Shape(double l,double w)
    {
        length=l;
        width=w;
    }
    Shape(double side1,double bas,double side2,double hei)
    {
        a=side1;
        base=bas;
        c=side2;
        height=hei;
    }
    Shape(double r)
    {
        radius=r;
    }
    void triangle()
    {
        String ta="The Area of the triangle is"+((height*base)/2);
        LOGGER.info(ta);
        String tp="The perimeter of the triangle is"+(a+base+c);
        LOGGER.info(tp);
    }
    void circle()
    {
        String ca="The Area of the circle is"+((3.14)*radius*radius);
        LOGGER.info(ca);
        String cp="The perimeter of the circle is"+((3.14)*2*radius);
        LOGGER.info(cp);
    }
    void rectangle()
    {
        String ra="The Area of the rectangle is"+(width*length);
        LOGGER.info(ra);
        String rp="The perimeter of the rectangle is"+(2*(width+length));
        LOGGER.info(rp);
    }
    public static void main(String[] args) {
        double l;
        double side1;
        double side2;
        double bas;
        double hei;
        double r;
        double w;
        int o=0;
        Scanner sc = new Scanner(System.in);
        while(o==0) {
            try{
                LOGGER.log(Level.INFO, "Enter the choice:");
                LOGGER.log(Level.INFO, "1.triangle 2.circle 3.rectangle");
                int choice = sc.nextInt();
                if (choice == 1) {
                    LOGGER.log(Level.INFO, "Enter the side1 value:");
                    side1 = sc.nextDouble();
                    LOGGER.log(Level.INFO, "Enter the side2 value: ");
                    side2 = sc.nextDouble();
                    LOGGER.log(Level.INFO, "Enter the base value:");
                    bas = sc.nextDouble();
                    LOGGER.log(Level.INFO, "Enter the height value:");
                    hei = sc.nextDouble();
                    Shape s = new Shape(side1, bas, side2, hei);
                    s.triangle();
                } else if (choice == 2) {
                    LOGGER.log(Level.INFO, "Enter the radius value:");
                    r = sc.nextDouble();
                    Shape s = new Shape(r);
                    s.circle();

                } else if (choice == 3) {
                    LOGGER.log(Level.INFO, "Enter the length value:");
                    l = sc.nextDouble();
                    LOGGER.log(Level.INFO, "Enter the width value:");
                    w = sc.nextDouble();
                    Shape s = new Shape(l, w);
                    s.rectangle();

                } else if (choice == 4) {
                    o = 1;
                }
            } catch (Exception e)
            {
                String ec = ""+e;
                LOGGER.info(ec);
                sc.nextLine();
            }
        }
    }

}