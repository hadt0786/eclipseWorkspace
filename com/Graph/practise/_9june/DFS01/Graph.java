package com.Graph.practise._9june.DFS01;

import java.util.List;

public interface Graph {

    enum GraphType {
        DIRECTED,
        UNDIRECTED
    }

    void addEdge(int v1, int v2);

    List<Integer> getAdjacentVertices(int v);
}