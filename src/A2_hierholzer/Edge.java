package A2_hierholzer;

public class Edge {
    private final Vertex v1;
    private final Vertex v2;
    private boolean visited;

    public Edge(Vertex v1, Vertex v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.visited = false;
        addEdgeToVertices();
    }

    public Vertex getV1() {
        return v1;
    }

    public Vertex getV2() {
        return v2;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getOtherEnd(Vertex v) {
        if (v == this.v1) {
            return v2;
        }

        if (v == this.v2) {
            return v1;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Edge " + v1 + " – " + v2;
    }

    private void addEdgeToVertices() {
        v1.getEdgeList().add(this);
        v2.getEdgeList().add(this);
    }
}
