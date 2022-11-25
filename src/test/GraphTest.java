package test;

import MPTD_EyOD.Graph;

public class GraphTest {
    public static void main(String[] args) {
        // crear una intancia Graph, constructor default
        Graph defaultGraph = new Graph();
        
        System.out.println(defaultGraph.toSting() );
        
        defaultGraph.setVertex(3);
        System.out.println(defaultGraph.toSting() );
        
        defaultGraph.setEdge(0, 1);
        defaultGraph.setEdge(1, 2);
        defaultGraph.setEdge(0, 2);
        
        System.out.println(defaultGraph.toSting() );
    }
}
