package com.algorithms.sorting;

import java.util.*;

public class TopologicalSort {
    public int vertex;
    public ArrayList<ArrayList<Integer>> adjacent;

    //Constructor
    TopologicalSort(int vertex) {
        this.vertex = vertex;
        adjacent = new ArrayList<>(vertex);
        for (int i = 0; i < vertex; ++i) adjacent.add(new ArrayList<>());
    }
    public void addEdge(int vertex, int weight) { adjacent.get(vertex).add(weight); }

    public void topologicalRecur(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (Integer adjacent_vertex : adjacent.get(v)) {
            if (!visited[adjacent_vertex])
                topologicalRecur(adjacent_vertex, visited, stack);
        }
        stack.push((v));
    }

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertex];
        for (int i = 0; i < vertex; i++) visited[i] = false;
        for (int i = 0; i < vertex; i++) {
            if (!visited[i]) topologicalRecur(i, visited, stack);
        }
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }

    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        System.out.println("Topological Sorting: ");
        graph.topologicalSort();
    }
}
