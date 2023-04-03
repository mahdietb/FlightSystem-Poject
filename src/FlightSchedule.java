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

    public void setFlight(String flightID,String origin,String destination,String time, String date, String price,String seats) {
        this.flightID = flightID;
        this.origin = origin;
        this.destination = destination;
        this.time= time;
        this.date = date;
        this.price = price;

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
