package com.data_structures;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<Integer>[] list = new LinkedList[10];

    public void createList() {
        for(int i = 0; i < 10; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addData() {
        list[0].add(10);
        list[0].add(20);
        list[1].add(30);
        list[2].add(40);
        list[2].add(50);
    }

    public void displayGraph() {
        for(int i = 0; i < list.length; i++) {
            System.out.println(i + " ==>" + list[i]);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.createList();
        graph.addData();
        graph.displayGraph();
    }
}
