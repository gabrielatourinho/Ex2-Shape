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
public class Circle extends Shape {
    private int radius;
    public Circle(String aName) {
        super(aName);
        radius = 3;
    }
    public float calculateArea () {
        float area;
        area = (float)(3.14*radius*radius);
        return area;
    }
    
}
