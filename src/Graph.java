import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Airport> nodes = new HashSet<>();

    public void addNode(Airport nodeA) {
        nodes.add(nodeA);
    }
}
