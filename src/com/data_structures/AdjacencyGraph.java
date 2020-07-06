package com.data_structures;
import java.util.LinkedList;

public class AdjacencyGraph {
    static class Edge {
        int vertex, weight;
        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        public String toString() {
            return "("+vertex+", "+weight+")";
        }
    }

    LinkedList<Edge>[] graph;
    public AdjacencyGraph(int vertices) {
        graph = new LinkedList[vertices];
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }
    }
    public void addEdge(int start_v, int end_v, int weight) {
        graph[start_v].add(0, new Edge(end_v, weight));
    }

    public boolean isConnected(int start_v, int end_v) {
        for (Edge e : graph[start_v]) {
            if(e.vertex == end_v) return true;
        } return false;
    }

    public void displayGraph() {
        for (LinkedList<Edge> edges : graph) {
            System.out.println(edges);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < graph.length; i++) {
            result.append(i).append(" ").append("=>").append(graph[i]).append("\n");
        }
        return result.toString();
    }


    public static void main(String[] args) {
        AdjacencyGraph graph = new AdjacencyGraph(10);
        graph.addEdge(5, 1, 0);
        graph.addEdge(1, 4, 0);
        graph.addEdge(1, 2, 0);
        graph.addEdge(2, 7, 0);
        graph.addEdge(2, 6, 0);
        graph.addEdge(2, 3, 0);
        System.out.println(graph);
        System.out.println(graph.isConnected(1, 2));
    }
}