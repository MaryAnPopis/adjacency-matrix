package edu.structures.controllers;

import edu.structures.models.Graph;

public class GraphController {
    private Graph g;

    /**
     * Sets the graph number of vertices
     * @param vertices total number of vertices that the matrix is going to have
     */
    public GraphController(int vertices){
        g = new Graph(vertices);
        g.setVertices(vertices);
    }

    /**
     * Returns the value of a position between two vertices
     * @param to vertex one
     * @param from vertex two
     * @return exception
     */
    public int getEdge(int to, int from) {
        try
        {
            return g.getAdjacencyMatrix()[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
           throw index;
        }
    }

    /**
     * Create an edge between two vertices
     * @param to vertex one
     * @param from vertex two
     * @param edge the linked between the two vertices
     * @return success or error
     */
    public boolean addEdge(int to, int from, int edge){
        try
        {
            g.getAdjacencyMatrix()[to][from] = edge;
            g.getAdjacencyMatrix()[from][to] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            return false;
        }
        return true;
    }

    public int getTotalVertices(){
       return g.getVertices();
    }

}
