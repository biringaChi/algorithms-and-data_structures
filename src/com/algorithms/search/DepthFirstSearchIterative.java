package com.algorithms.search;

import java.util.*;

public class DepthFirstSearchIterative {

    int vertices;
    LinkedList<Integer>[] adjacent;

    DepthFirstSearchIterative(int vertices) {
        this.vertices = vertices;
        adjacent = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) adjacent[i] = new LinkedList<Integer>();
    }

    public void addEdge(int start_vertex, int end_vertex) {
        adjacent[start_vertex].add(end_vertex);
    }

    public void depthFirstSearchIterative(int source_vertex) {
        ArrayList<Boolean> visited = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) { visited.add(false); }
        Stack<Integer> stack = new Stack<>();
        stack.push(source_vertex);

        while (!stack.isEmpty()) {
            source_vertex = stack.peek();
            stack.pop();
            if (!visited.get(source_vertex)) {
                System.out.print(source_vertex + " ");
                visited.set(source_vertex, true);
            }
            for (int adjacent_vertex : adjacent[source_vertex]) {
                if (!visited.get(adjacent_vertex)) stack.push(adjacent_vertex);
            }
        }
    }

    public static void main(String[] args) {
        DepthFirstSearchIterative dfs = new DepthFirstSearchIterative(8);
        dfs.addEdge(1, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(2, 4);
        dfs.addEdge(2, 5);
        dfs.addEdge(3, 6);
        dfs.addEdge(3, 7);
        dfs.depthFirstSearchIterative(1);
    }
}

