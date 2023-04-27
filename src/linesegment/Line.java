package linesegment;

import point.Point;

import java.text.DecimalFormat;

public class Line {

    public DecimalFormat defor=new DecimalFormat("0.00");

    Point p1;
    Point p2;

    public Line(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }

   public String Length(){
        double ans=  Math.sqrt(Math.pow(p1.getX()- p2.getX(),2 )+Math.pow(p1.getY()-p2.getY(),2));
        return  defor.format(ans);
   }
}
