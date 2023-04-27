import linesegment.Line;
import point.Point;

public class Main {
    public static void main(String[] args) {
        Point p1=new Point(15,20);
        Point p2=new Point(23,30);

        Line line=new Line(p1,p2);

        System.out.println("This Distance between ("+p1.getX()+","+p1.getY()+") and ("+p2.getX()+","+p2.getY()+") is -> "+line.Length());
    }
}