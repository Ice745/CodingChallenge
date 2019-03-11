import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Algorithm {

    public void algorithm(Graph graph, String start, String finish){
        int minFlights=Integer.MAX_VALUE;
        Airport source= graph.getAirport(start);

    }

    public static void main(String args[]){
        try{
            String path= "C:\\Users\\Setriakor Addom\\Documents\\Ashesi\\Career Fair Code 2019\\";
            String routes1 = "routes.csv";
            String airlines1 = "airlines.csv";
            String airports1 = "airports.csv";
            File file_routes= new File(path+routes1);
            File file_airports= new File(path+airports1);
            File file_airlines= new File(path+airlines1);
            Scanner airports= new Scanner(file_airports);
            Scanner routes= new Scanner(file_routes);
            Scanner airlines= new Scanner(file_airlines);
            Graph graph= new Graph();
            while(airports.hasNextLine()){
                String line = airports.nextLine();
                List<String> list = Arrays.asList(line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"));
                Airport airport= new Airport(Integer.parseInt(list.get(0)),list.get(1),list.get(2),list.get(3),list.get(4),
                        list.get(5), Double.parseDouble(list.get(6)),Double.parseDouble(list.get(6)));
                graph.addNode(airport);
                //System.out.println(airport.iata);


            }
            airports.close();
            while(routes.hasNextLine()){
                String line = routes.nextLine();
                List<String> list = Arrays.asList(line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"));
                if(graph.getAirport("\""+list.get(2))==null || graph.getAirport("\""+list.get(4))==null){
                    continue;
                }
                if(list.get(5).equals("\\N")){
                    list.set(5,"0");
                }else if(list.get(3).equals("\\N")) {
                    list.set(3, "0");
                }
                Route route = new Route(list.get(0),Integer.parseInt(list.get(1)),list.get(2),Integer.parseInt(list.get(3)),
                        list.get(4),Integer.parseInt(list.get(5)),Integer.parseInt(list.get(7)));
                Airport source=graph.getAirport("\""+route.sAirportCode+"\"");
                //System.out.println(graph.getAirport("\""+route.dAirportcode+"\"").iata);
                source.adjacentNodes.put(graph.getAirport("\""+route.dAirportcode+"\""),route);
                graph.nodes.replace("\""+route.sAirportCode+"\"",source);

            }
            //routes.close();
        }catch(Exception e){System.out.println(e);}
    }
}
