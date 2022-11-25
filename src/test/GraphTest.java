/*
 * ITESS-TICS 
 * Ago-Dic2022
 * MPTD
 * Description: Graph class test.
 * by FJMP
 * frajavimopu@gmail.com
 */
package test;

import MPTD_EyOD.Graph;

public class GraphTest {
    public static void main(String[] args) {
        // crear una intancia Graph, constructor default
        System.out.println("Graph default constructor ------------");
        Graph defaultGraph = new Graph();
        
        System.out.println(defaultGraph );
        
        defaultGraph.setVertex(3);
        System.out.println(defaultGraph.toString() );
        
        defaultGraph.setEdge(0, 1);
        defaultGraph.setEdge(1, 2);
        defaultGraph.setEdge(0, 2);
        
        System.out.println(defaultGraph.toString() );
        
        
        // crear una instancia Graph, constructor vertices
        System.out.println("Graph params constructor -------------");
        Graph paramGraph = new Graph(5);
        
        System.out.println(paramGraph.toString());
        
    }
}
