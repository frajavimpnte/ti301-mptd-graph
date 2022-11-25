package test;


public class TI301TestNetbeans {

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
