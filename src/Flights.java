import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Flights {
    Scanner get = new Scanner(System.in);
    private ArrayList<FlightSchedule> flightSchedules = new ArrayList<>();
    private ArrayList<String> ticket = new ArrayList<>();
    private ArrayList<FlightSchedule> flightId = new ArrayList<>();
    private ArrayList<FlightSchedule> origin = new ArrayList<>();
    private ArrayList<FlightSchedule> destination = new ArrayList<>();
    private ArrayList<FlightSchedule> time = new ArrayList<>();
    private ArrayList<FlightSchedule> date = new ArrayList<>();
    private ArrayList<FlightSchedule> price = new ArrayList<>();
    private ArrayList<FlightSchedule> seats = new ArrayList<>();

    public void addDefault() {
        flightSchedules.add(new FlightSchedule("WS-12", "Yazd", "Isfahan", "12:31", "1402-03-14", "700,000", "12"));
        flightSchedules.add(new FlightSchedule("WA-43", "Tehran", "Isfahan", "00:31", "1402-02-14", "1,000,000", "119"));
        flightSchedules.add(new FlightSchedule("AD-31", "Tehran", "Rasht", "09:00", "1402-02-10", "900,000", "89"));
        flightSchedules.add(new FlightSchedule("MN-02", "KishIsland", "Isfahan", "10:45", "1402-01-02", "1,300,000", "8"));
        flightSchedules.add(new FlightSchedule("KA-12", "Tehran", "Qom", "11:30", "1402-02-01", "700,000", "100"));
        flightSchedules.add(new FlightSchedule("BG-44", "Isfahan", "Mashhad", "12:40", "1402-01-20", "1,500,000", "87"));
        flightSchedules.add(new FlightSchedule("BG-71", "Mashhad", "Tehran", "01:40", "1402-03-12", "1,500,000", "77"));
        flightSchedules.add(new FlightSchedule("ZX-10", "Mashhad", "Isfahan", "13:50", "1402-03-09", "1,300,000", "137"));
        flightSchedules.add(new FlightSchedule("SE-11", "Shiraz", "Yazd", "10:00", "1402-01-08", "900,000", "70"));
        flightSchedules.add(new FlightSchedule("HJ-11", "Tabriz", "Mashhad", "00:20", "1402-01-21", "1,500,000", "60"));
        flightSchedules.add(new FlightSchedule("GS-13", "Qom", "Tehran", "01:10", "1402-03-02", "500,000", "17"));
        flightSchedules.add(new FlightSchedule("GZ-27", "Abadan", "Isfahan", "08:00", "1402-04-12", "1,000,000", "5"));
        flightSchedules.add(new FlightSchedule("JK-34", "Tehran", "Isfahan", "11:00", "1402-01-13", "1,000,000", "130"));
        flightSchedules.add(new FlightSchedule("SH-65", "Mashhad", "Isfahan", "17:20", "1402-01-20", "1,500,000", "67"));
        flightSchedules.add(new FlightSchedule("PL-19", "Rasht", "Tabriz", "00:00", "1402-02-22", "700,000", "230"));
        flightSchedules.add(new FlightSchedule("RA-88", "Kerman", "Isfahan", "15:00", "1402-04-29", "1,000,000", "44"));
        flightSchedules.add(new FlightSchedule("YU-71", "KishIsland", "Tehran", "21:30", "1402-03-30", "1,700,000", "117"));
        flightSchedules.add(new FlightSchedule("WZ-54", "Shiraz", "chabahar", "11:40", "1402-01-27", "800,000", "90"));
        flightSchedules.add(new FlightSchedule("PO-56", "Ramsar", "Tehran", "08:30", "1402-03-10", "800,000", "9"));


    }

    public ArrayList<FlightSchedule> getFlightSchedules() {
        return flightSchedules;
    }

    public void setFlightSchedules(ArrayList<FlightSchedule> flightSchedules) {
        this.flightSchedules = flightSchedules;
    }

    @Override
    public String toString() {
        System.out.println(flightSchedules);
        return "Flights{" +
                "flightSchedules=" + flightSchedules +
                '}';


    }

    public void addFlight() {
        String[] informationArray = new String[7];
        fill(informationArray);
        flightSchedules.add(new FlightSchedule(informationArray[0], informationArray[1], informationArray[2], informationArray[3], informationArray[4], informationArray[5], informationArray[6]));
    }

    public void removeFlight() {

        System.out.print("the number of flight =");
        int number = get.nextInt();
        flightSchedules.remove(number);
    }

    public void updateFlight() {
        String[] informationArray = new String[7];
        System.out.print("the ID of flight =");
        String flightID = get.next();
        for (int i = 0; i < flightSchedules.size(); i++) {
            String id = flightSchedules.get(i).getFlight();
            if (Objects.equals(id, flightID)) {
                fill(informationArray);
                flightSchedules.get(i).setFlight(informationArray[0], informationArray[1], informationArray[2], informationArray[3], informationArray[4], informationArray[5], informationArray[6]);

            }
        }

    }



    public void printFlightSchedules() {

        for (int i = 0; i < flightSchedules.size(); i++) {
            System.out.println(".....................................");
            System.out.println("Flight" + i + ")" + flightSchedules.get(i).toString());

        }
    }



//    public String bookTicket() {
//
//        String flightId = search();
//        for (int i = 0; i < flightSchedules.size(); i++) {
//            if (Objects.equals(flightId, flightSchedules.get(i).getFlight())) {
//
//            }
//        }
//        return "0";
//    }
//
//    public String ticketId(String flightID) {
//        char[] id = flightID.toCharArray();
//        //id[4]=id[]+;
//
//        return flightID;
//    }


    public void fill(String[] fillArray) {


        System.out.println("please fill the information you want");
        System.out.print("flightID :");
        fillArray[0] = get.nextLine();
        System.out.print("origin :");
        fillArray[1] = get.nextLine();
        System.out.print("destination :");
        fillArray[2] = get.nextLine();
        System.out.print("time :");
        fillArray[3] = get.nextLine();
        System.out.print("date :");
        fillArray[4] = get.nextLine();
        System.out.print("price :");
        fillArray[5] = get.nextLine();
        System.out.print("seats :");
        fillArray[6] = get.nextLine();

    }
}
