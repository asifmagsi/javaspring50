/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author Shahzad
 */
public class Line {

//    double x1, y1, x2, y2;
    Point start, end;

    Line() {
        this(new Point(), new Point());
    }

    Line(double x1, double x2, double y1, double y2) {
//        start = new Point(x1, y1) ;
//        end = new Point(x2, y2) ;
        this(new Point(x1, y1), new Point(x2, y2));
    }

    // SRP = Main 
    Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    Line(Line line) {
//        this.start = new Point(line.start) ;
//        this.end = new Point(line.end) ;
        this(line.start, line.end);
    }

    double length() {
        return start.distance(end);
    }
    
    void rotate90(){
        start.move(0, end.getY());
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + '}';
    }

    public static void main(String[] args) {
        Line line = new Line(0, 0, 20, 20);
        System.out.println(line);
    }

}
