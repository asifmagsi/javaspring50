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
public class Point implements Cloneable {

    private static long vCount = 0 ;
    
    // attribute
    private double x;
    private double y;

    // properties, method, function
    // no return
    // Constructor
    // no-argument, default
    Point() {
//        x = 0.0 ;
//        y = 0.0 ;
        this(0.0, 0.0);
    }

    Point(double newX, double newY) {
        x = newX;
        y = newY;
        
        vCount ++ ;
    }

    Point(Point p) {
//        x = p.x;
//        y = p.y;
        this(p.x, p.y);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone() ;
//        return new Point(this.x, this.y);
    }

    // return
    double getX() {
        return x;
    }

    void setX(double newX) {
        x = newX;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    double distance(Point p) {
        return Math.sqrt(
                ((p.y - this.y) * (p.y - this.y))
                + ((p.x - this.x) * (p.x - this.x)));
    }

    void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        Point p = new Point(2, 3);
        Point p1 = new Point(p);
        p.setX(10);
        System.out.println(p.x + ":" + p.y);
    }
}
