/*
 * 

 */
package MPTD_EyOD;


public class Graph {
    final int NUM_VERTEX_MAX = 100;
    int[]     vertex;
    int       numVertex;
    int[][]   edge;
    int       numEdge;
    
    public Graph() {
        init();
    }

    public Graph(int numVertex) {
        init();
        setVertex(numVertex);
    }
    
     public void init() {
        vertex = new int[NUM_VERTEX_MAX];
        edge   = new int[NUM_VERTEX_MAX][2];
    }
    // dato numVertex, los vertices se enumeran 0,1....numVertex-1
    public void setVertex(int numVertex) {
        for (int i = 0; i < this.numVertex; i++)
            this.vertex[i] = i;
       
        this.numVertex = numVertex;
    }
    
    public void setEdge(int i, int j) {
        this.edge[numEdge][0] = i;
        this.edge[numEdge][1] = j;
        numEdge++;
    }
    
    public String toString() {
        String out = "Graph ----------\n";
        out += "vertices : [";
        for (int i = 0; i < numVertex; i++) {
            out += i + ((i < numVertex-1)?", ":"");
        }
        out += "]\n";
        
        out += "aristas : [";
        for (int i = 0; i < numEdge; i++) {
            out += "(" + edge[i][0] + ", " + edge[i][1] + 
                    ((i < numVertex-1)?"), ":")") ;
        }
        out += "]\n";
        
        
        return out;
    }
    
}
