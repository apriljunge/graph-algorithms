package A2_hierholzer;

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

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);
        graph.addVertex(G);

        new Edge(A, B).setLength(10);
        new Edge(A, C).setLength(37);
        new Edge(A, F).setLength(21);
        new Edge(B, D).setLength(94);
        new Edge(B, F).setLength(34);
        new Edge(C, D).setLength(50);
        new Edge(C, E).setLength(99);
        new Edge(C, F).setLength(22);
    }
}