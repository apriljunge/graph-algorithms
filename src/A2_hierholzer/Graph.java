package A2_hierholzer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

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
        if (this.isEulerian() == false) {
            return null;
        }

        List<Vertex> mainTour = new LinkedList<>();

        while (hasUnvisitedEdges()) {
            List<Vertex> subTour;
            subTour = findTour(determineStartVertexFromList(vertices));
            insertIntoMainTour(mainTour, subTour);
        }

        return mainTour;
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
        List<Vertex> visitedVertices;
        visitedVertices = new ArrayList<>();

        Vertex current;
        current = start;

        do {
            visitedVertices.add(current);
            Edge edge = findUnvisitedEdge(current);
            edge.setVisited(true);
            current = edge.getOtherEnd(current);
        } while (current != start);

        visitedVertices.add(current);

        return visitedVertices;
    }

    private void insertIntoMainTour(List<Vertex> mainTour, List<Vertex> subTour) {
        if (mainTour.size() == 0) {
            mainTour.addAll(subTour);
            return;
        }

        int index = mainTour.indexOf(subTour.get(0));

        // first and last index are doubled
        subTour.remove(0);

        mainTour.addAll(index, subTour);
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
        List<Edge> edgeList;
        edgeList = v.getEdgeList();

        for (int i = 0; i < edgeList.size(); i++) {
            Edge edge;
            edge = edgeList.get(i);
            if (edge.isVisited() == false) {
                return edge;
            }
        }

        return null;
    }
}
