import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Airport {
    int id;
    String name;
    String city;
    String country;
    String iata;
    String icao;
    double lat;
    double lng;
    Map<Airport, Route> adjacentNodes = new HashMap<>();

    public Airport(int id, String name, String city, String country, String iata, String icao, double lat, double lng) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.iata = iata;
        this.icao = icao;
        this.lat = lat;
        this.lng = lng;
    }

    public void addDestination(Airport destination, Route path) {
        adjacentNodes.put(destination, path);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return id == airport.id &&
                name.equals(airport.name) &&
                city.equals(airport.city) &&
                country.equals(airport.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, country);
    }
}


