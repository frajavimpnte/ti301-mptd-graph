/*
 * ITESS-TICS 
 * Ago-Dic2022
 * MPTD
 * Description: Triangle class
 * by FJMP
 * frajavimopu@gmail.com
 */
package MPTD_EyOD;


public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public Triangle() {
    }
    
    public double computeArea() {
        return this.base * this.height / 2;
    }
    
    @Override
    public String toString() {
        return "Triangle base: " + this.base + " height: " + this.height;
    }
}
