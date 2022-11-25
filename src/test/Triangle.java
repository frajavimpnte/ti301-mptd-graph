/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author TICS03
 */
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
