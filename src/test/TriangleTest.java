/*
 * ITESS-TICS 
 * Ago-Dic2022
 * MPTD
 * Description: Triangle class test.
 * by FJMP
 * frajavimopu@gmail.com
 */
package test;

import MPTD_EyOD.Triangle;


public class TriangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle triDefault = new Triangle();
        
        System.out.println(triDefault);
        System.out.println("Area: " + triDefault.computeArea());
        
        Triangle triParams = new Triangle(5.0, 4.0);
        System.out.println(triParams);
        System.out.println("Area: " + triParams.computeArea());
        
        
        //
        
    }
    
}
