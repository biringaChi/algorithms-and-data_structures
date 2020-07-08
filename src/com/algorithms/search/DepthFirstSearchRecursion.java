package com.algorithms.search;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearchRecursion {
    int vertices;
    LinkedList<Integer>[] adjacent;

    DepthFirstSearchRecursion(int vertices) {
        this.vertices = vertices;
        adjacent = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) adjacent[i] = new LinkedList();
    }

    public void addEdge(int start_vertex, int end_vertex) {
        adjacent[start_vertex].add(end_vertex);
    }

    public void depthFirstSearch(int vertices, boolean[] visited) {
        visited[vertices] = true;
        System.out.print(vertices + " ");

        for (int adjacent_vertex : adjacent[vertices]) {
            if (!visited[adjacent_vertex])
                depthFirstSearch(adjacent_vertex, visited);
        }
    }
    public void callDepthFirstSearch(int vertex) {
        boolean[] visited = new boolean[vertices];
        depthFirstSearch(vertex, visited);
    }

    public static void main(String[] args) {
        DepthFirstSearchRecursion dfs = new DepthFirstSearchRecursion(8);
        dfs.addEdge(1, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(2, 4);
        dfs.addEdge(2, 5);
        dfs.addEdge(3, 6);
        dfs.addEdge(3, 7);
        dfs.callDepthFirstSearch(1);
    }
}
