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
    }
}
