/*
 * ITESS-TICS 
 * Ago-Dic2022
 * MPTD
 * Description: Weighted Graph class, edge representation.
 * by FJMP
 * frajavimopu@gmail.com
 */
package MPTD_EyOD;

/**
 *
 * @author TICS03
 */
public class WeightedGraph extends Graph {
    int[]       weight;
    
    public WeightedGraph() {
        super();
        weight = new int[NUM_VERTEX_MAX];
    }
    
    public WeightedGraph(int numVertex) {
        super(numVertex);
        weight = new int[NUM_VERTEX_MAX];
    }
    
    public void setEdge(int i, int j, int weight) {
        this.weight[numEdge] = weight;
        super.setEdge(i, j);
    }
    
    public String toString() {
        String out = super.toString();
        
        out += "weights : [";
        for (int i = 0; i < numEdge; i++) 
            out +=  weight[i] +  ((i < numEdge-1)?"), ":")") ;
        out += "]\n";
        
        return out;
    }
}
