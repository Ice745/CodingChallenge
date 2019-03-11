public class Route {
    String airlineCode;
    int airlineId;
    String sAirportCode;
    int sAirportID;
    String dAirportcode;
    int dAirportId;
    int stops;

    public Route(String airlineCode, int airlineId, String sAirportCode, int sAirportID, String dAirportcode, int dAirportId, int stops) {
        this.airlineCode = airlineCode;
        this.airlineId = airlineId;
        this.sAirportCode = sAirportCode;
        this.sAirportID = sAirportID;
        this.dAirportcode = dAirportcode;
        this.dAirportId = dAirportId;
        this.stops = stops;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public String getsAirportCode() {
        return sAirportCode;
    }

    public void setsAirportCode(String sAirportCode) {
        this.sAirportCode = sAirportCode;
    }

    public int getsAirportID() {
        return sAirportID;
    }

    public void setsAirportID(int sAirportID) {
        this.sAirportID = sAirportID;
    }

    public String getdAirportcode() {
        return dAirportcode;
    }

    public void setdAirportcode(String dAirportcode) {
        this.dAirportcode = dAirportcode;
    }

    public int getdAirportId() {
        return dAirportId;
    }

    public void setdAirportId(int dAirportId) {
        this.dAirportId = dAirportId;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }
}
