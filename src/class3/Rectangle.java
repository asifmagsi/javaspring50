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
public class Rectangle {

    Line width, height;

    public Rectangle() {
        this ( new Line(), new Line()) ;
    }

    Rectangle(Point s1, Point s2, Point s3, Point s4) {
        this(new Line(s1, s2), new Line(s3, s4));
    }

    Rectangle(Line width, Line height) {
        this.width = new Line(width);
        this.height = new Line(height);
    }
    
    Rectangle ( Rectangle rec ) {
        this(rec.width, rec.height) ;
    }
    
    double area ( ) {
        return width.length() * height.length() ;
    }
    
    void counterRotate(){
        width.rotate90(); 
        height.rotate90();
    }
}
