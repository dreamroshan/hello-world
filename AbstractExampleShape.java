/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.example.shape;

/**
 *
 * @author Roshan
 */
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Draw Rectangle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Draw Triangle");
    }
}

    

public class AbstractExampleShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Rectangle();
        s1.draw();
        s1 = new Triangle();
        s1.draw();
    }
    
}
