/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;
import java.lang.Math;
import static java.lang.Math.sqrt;
/**
 *
 * @author Gabriela
 */
public class Triangle extends Shape {
    private float a, b, c;
    public Triangle(String aName) {
        super(aName);
        a = 12;
        b = 13;
        c = 5;
    }
    
    public float calculateArea() {
        float area, p;
        p = (float)(a+b+c)/2;
        area = (float)sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    
    
}
