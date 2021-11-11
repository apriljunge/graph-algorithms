package A2_hierholzer;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Edge> edgeList;

    public Vertex(String name) {
        this.name = name;
        edgeList = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public int getDegree() {
        return edgeList.size();
    }

    @Override
    public String toString() {
        return "Vertex " + name;
    }
}
