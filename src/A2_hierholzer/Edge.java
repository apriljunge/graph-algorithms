package A2_hierholzer;

import java.util.List;

public class Edge {
    private Vertex v1;
    private Vertex v2;
    private boolean visited;

    public Edge(Vertex v1, Vertex v2) {
        this.v1 = v1;
        this.v2 = v2;
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

    public Vertex getOtherEnd(Vertex v) throws Exception {
        if (v == this.v1) {
            return v2;
        }

        if (v == this.v2) {
            return v1;
        }

        throw new Exception("Dieser Vertex ist nicht mit der Edge verbunden");
    }

    @Override
    public String toString() {
        return "Die Edge verbindet " + v1 + " und " + v2;
    }

    private void addEdgeToVertices() {
        v1.getEdgeList().add(this);
        v2.getEdgeList().add(this);
    }
}
