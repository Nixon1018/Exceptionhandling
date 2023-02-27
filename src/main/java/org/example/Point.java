package org.example;
public class Point implements Cloneable{
    double x;
    double y;
    Point(double p1,double p2){
        x=p1;
        y=p2;
    }
    String check(double x,double y)
    {
        return ( this.x==x && this.y==y)?"true":"false";

    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}