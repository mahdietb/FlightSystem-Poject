public class FlightSchedule {
    private String flightId;
    private String origin;
    private String destination;
    private String time;
    private String date;
    private String price;
    private String seats;

    public FlightSchedule(String flightID, String origin, String destination, String time, String date, String price, String seats) {
        this.flightId = flightID;
        this.origin = origin;
        this.destination = destination;
        this.time = time;
        this.date = date;
        this.price = price;
        this.seats = seats;
    }


    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getFlight() {
        return flightId;

    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "{" +
                "flightID='" + flightId + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", price='" + price + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }

}
