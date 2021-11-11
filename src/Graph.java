package A2_hierholzer;

import java.util.List;

public class Graph {
    private List<Vertex> vertices;

    public Graph() {}

    public void addVertex(Vertex v) {
        this.vertices.add(v);
    }

    public void removeVertex(Vertex v) {
        this.vertices.remove(v);
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public boolean isEulerian() {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDegree() % 2 == 1) {
                return false;
            }
        }

        return true;
    }

    public List<Vertex> findEulerTour() {

    }

    private Vertex determineStartVertexFromList(List<Vertex> vertexList) {
        for (int i = 0; i < vertexList.size(); i++) {
            Vertex vertex;
            vertex = vertexList.get(i);
            if (findUnvisitedEdge(vertex) != null) {
                return vertex;
            }
        }

        return null;
    }

    private List<Vertex> findTour(Vertex start) {
        Edge unvisitedeEdge;
        unvisitedeEdge = findUnvisitedEdge(start);
        unvisitedeEdge.getOtherEnd(start);
    }

    private void insertIntoMainTour(List<Vertex> mainTour, List<Vertex> subTour) {

    }

    private boolean hasUnvisitedEdges() {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (findUnvisitedEdge(this.vertices.get(i)) != null) {
                return true;
            }
        }

        return false;
    }

    private Edge findUnvisitedEdge(Vertex v) {
        List<Edge> EdgeList;
        EdgeList = v.getEdgeList();
        for (int i = 0; i < EdgeList.size(); i++) {
            Edge edge;
            edge = EdgeList.get(i);
            if (edge.isVisited() == false) {
                return edge;
            }
        }

        return null;
    }
}
