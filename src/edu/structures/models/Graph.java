package edu.structures.models;

/**
 * This is a Undirected graph implemented on a adjacency matrix
 */
public class Graph {
    private int [][] adjacencyMatrix;
    private int vertices;

    public Graph(int vertices){
        setVertices(vertices);
        adjacencyMatrix = new int[vertices + 1][vertices + 1];
    }

    public int getVertices() {
        return this.vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }
}
