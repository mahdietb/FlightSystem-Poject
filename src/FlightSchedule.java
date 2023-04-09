public class FlightSchedule {
    private String flightID;
    private String origin;
    private String destination;
    private String time;
    private String date;
    private String price;
    private String seats;

    public FlightSchedule(String flightID, String origin, String destination, String time, String date, String price, String seats) {
        this.flightID = flightID;
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

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getPrice() {
        return price;
    }

    public String getSeats() {
        return seats;
    }



    public String getFlight() {
        return flightID;

    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "{" +
                "flightID='" + flightID + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", price='" + price + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }
}
