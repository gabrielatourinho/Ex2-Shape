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
public class Square extends Shape {
    private int side;
    public Square(String aName) {
        super(aName);
        side = 3;
    }
    
    public float calculateArea() {
        float area;
        area = (float)(side*side);
        return side;
    }
    
}
