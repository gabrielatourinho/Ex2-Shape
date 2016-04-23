/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Gabriela
 */
public class Shape {

    private String name;
    Shape (String aName) {name = aName;}
    public String getName() {return name;}
    public float calculateArea() {return 0.0f;}
    
    public static void main(String[] args) {
        
        Circle c = new Circle("Circle C");
        Square s = new Square("Square S");
        Triangle t = new Triangle("Triangle T");
        Shape shapeArray[] = {c, s, t};
        for(int i=0; i<shapeArray.length; i++){
            System.out.println("The area of " + shapeArray[i].getName() + " is " + shapeArray[i].calculateArea() + "sq. cm.\n");
        
        }
    }
    
}
