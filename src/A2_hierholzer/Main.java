package A2_hierholzer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);

        new Edge(a, b);
        new Edge(a, d);
        new Edge(b, c);
        new Edge(b, d);
        new Edge(b, e);
        new Edge(b, f);
        new Edge(b, g);
        new Edge(c, d);
        new Edge(c, e);
        new Edge(c, f);
        new Edge(d, e);
        new Edge(e, f);
        new Edge(f, g);

        System.out.println(graph.findEulerTour());


        // Dijkstra
        Graph dijkstraGraph = new Graph();

        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");

        dijkstraGraph.addVertex(A);
        dijkstraGraph.addVertex(B);
        dijkstraGraph.addVertex(C);
        dijkstraGraph.addVertex(D);
        dijkstraGraph.addVertex(E);
        dijkstraGraph.addVertex(F);
        dijkstraGraph.addVertex(G);

        new Edge(A, B, 10);
        new Edge(A, C, 37);
        new Edge(A, F, 21);
        new Edge(A, G, 46);
        new Edge(B, D, 94);
        new Edge(B, E, 58);
        new Edge(B, F, 34);
        new Edge(C, D, 50);
        new Edge(C, E, 99);
        new Edge(C, F, 22);
        new Edge(D, G, 11);
        new Edge(E, F, 13);
        new Edge(E, G, 89);
        new Edge(F, G, 95);

        List<Vertex> path1 = dijkstraGraph.findShortestPath(A, E);
        System.out.println("Pfad 1: " +  path1 + " hat die Länge " + path1.get(path1.size() - 1).getTentativeLength());
        
        List<Vertex> path2 = dijkstraGraph.findShortestPath(B, C);
        System.out.println("Pfad 2: " +  path2 + " hat die Länge " + path2.get(path2.size() - 1).getTentativeLength());
    }
}