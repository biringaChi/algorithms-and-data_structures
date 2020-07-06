package com.algorithms.search;
import java.util.LinkedList;

public class BreathFirstSearch {
        int vertices;
        LinkedList<Integer>[] adjacent;
        BreathFirstSearch(int vertices) {
            this.vertices = vertices;
            adjacent = new LinkedList[vertices];
            for (int i = 0; i < vertices; ++i) adjacent[i] = new LinkedList();
        }

    public void addEdge(int start_vertex, int end_vertex) {
        adjacent[start_vertex].add(end_vertex);
    }

    public void breathFirstSearch(int source_vertex) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        queue.add(source_vertex);
        visited[source_vertex] = true;

        while (!queue.isEmpty()) {
            source_vertex = queue.poll();
            System.out.print(source_vertex + " ");
            for (int adjacent_vertex : adjacent[source_vertex]) {
                if (!visited[adjacent_vertex]) {
                    queue.add(adjacent_vertex);
                    visited[adjacent_vertex] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        BreathFirstSearch bfs = new BreathFirstSearch(8);
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 4);
        bfs.addEdge(2, 5);
        bfs.addEdge(3, 6);
        bfs.addEdge(3, 7);
        bfs.breathFirstSearch(1);
    }
}
