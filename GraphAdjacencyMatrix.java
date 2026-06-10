// A simple implementation of an undirected graph using an adjacency matrix in Java

class Graph {
    private boolean[][] adjMatrix;  // Adjacency matrix to represent the graph
    private int vertices; // Number of vertices in the graph

    public Graph(int vertices) {
        this.vertices = vertices; // Set the number of vertices in the graph
        adjMatrix = new boolean[vertices][vertices]; // Initialize the adjacency matrix with the specified number of vertices

        for (int i = 0; i < vertices; i++) { // Initialize all entries in the adjacency matrix to false, indicating that there are no edges between any vertices initially
            for (int j = 0; j < vertices; j++) { // Loop through each entry in the adjacency matrix
                adjMatrix[i][j] = false; // Set the entry at position (i, j) to false, indicating that there is no edge between vertex i and vertex j
            }
        }
    }

    public void addEdge(int source, int destination) {  // Method to add an edge between two vertices in the graph
        adjMatrix[source][destination] = true; // Set the entry at position (source, destination) to true, indicating that there is an edge from the source vertex to the destination vertex
        adjMatrix[destination][source] = true; // Since this is an undirected graph, we also set the entry at position (destination, source) to true, indicating that there is an edge from the destination vertex back to the source vertex
    }

    public void display() {
        System.out.println("\nAdjacency Matrix\n"); // Print a header for the adjacency matrix display

        for (int i = 0; i < vertices; i++) { // Loop through each row of the adjacency matrix
            for (int j = 0; j < vertices; j++) { // Loop through each column of the adjacency matrix for the current row
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");  
                
            }
            System.out.println();
        }
    }
}

public class GraphAdjacencyMatrix {
    public static void main(String[] args) {

        Graph g = new Graph(6); // Create a graph with 6 vertices (numbered from 0 to 5)

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        g.display();
    }
}