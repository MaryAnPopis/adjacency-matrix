package edu.structures;

import edu.structures.controllers.GraphController;

import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static GraphController graph;

    public static void main(String[] args) {
       addNumberVertices();
       menu();
    }

    private static void addNumberVertices(){
        int opt,numVertices;
        System.out.println("The adjacency matrix have 8 vertices as default");
        System.out.println("Would you like to change the number of vertices? \n1. Yes\n2. No");
        opt = sc.nextInt();
        if (opt == 1){
            System.out.println("Insert the number of vertices you want: ");
            numVertices = sc.nextInt();
            graph = new GraphController(numVertices);
        }
        if(opt != 1){
            graph = new GraphController(8);
        }
    }

    private static void menu(){
        int option;
        do{
            System.out.println();
            System.out.println("Adjacency Matrix");
            System.out.println("-------------------------\n");
            System.out.println("1 - Display Matrix\n2 - Add edge\n3 - Exit");
            option = sc.nextInt();
            handleMenu(option);
        }while (option != 3);

    }

    private static void handleMenu(int option){
        switch (option){
            case 1:
                displayMatrix();
                break;
            case 2:
                addEdge();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid!");
                break;
        }
    }

    private static void displayMatrix() throws ArrayIndexOutOfBoundsException{
        int vertices = graph.getTotalVertices();

        System.out.print("  ");
        for (int i = 1; i <= vertices; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= vertices; i++){
            System.out.print(i + " ");
            for (int j = 1; j <= vertices; j++) {
                System.out.print(graph.getEdge(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static void addEdge(){
        int to,from;

        System.out.println("To insert an edge, we need two vertices");
        System.out.println("Type the first vertex : ");
        to = sc.nextInt();
        System.out.println("Type the second vertex : ");
        from = sc.nextInt();

        boolean isCorrect = graph.addEdge(to, from, 1);
        if (isCorrect){
            System.out.println("Vertex " + to + " and vertex  " + from + " were linked");
        }else{
            System.out.println("Invalid vertices!");
        }
    }
}
