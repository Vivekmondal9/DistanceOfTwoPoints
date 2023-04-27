import linesegment.Line;
import point.Point;

public class Main {
    public static void main(String[] args) {
        Point p1=new Point(15,20);
        Point p2=new Point(23,30);

        Line line=new Line(p1,p2);
        System.out.println("The Distance Between Two Points is -> "+line.Length());
    }
}