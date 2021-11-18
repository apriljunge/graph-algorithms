package A2_hierholzer;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    private String name;
    private List<Edge> edgeList;
    private double tentativeLength;
    private Vertex previous;

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

    public double getTentativeLength() {
        return tentativeLength;
    }

    public void setTentativeLength(double tentativeLength) {
        this.tentativeLength = tentativeLength;
    }

    public Vertex getPrevious() {
        return previous;
    }

    public void setPrevious(Vertex previous) {
        this.previous = previous;
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

    public int compareTo(Vertex v) {
        return Double.compare(this.tentativeLength, v.getTentativeLength());
    }
}
