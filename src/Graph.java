import java.util.HashMap;
import java.util.Map;

public class Graph {

    //private Set<Airport> nodes = new HashSet<>();
    Map<String,Airport> nodes = new HashMap<>();

    public void addNode(Airport nodeA) {
        nodes.put(nodeA.iata,nodeA);
    }
    public Airport getAirport(String iata){
        return nodes.get(iata);
    }

}
