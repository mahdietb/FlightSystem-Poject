import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Flights {
    Scanner get = new Scanner(System.in);
    //    private User user;
    private Users users = new Users();
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
        flightSchedules.add(new FlightSchedule("WS-12", "Yazd", "Isfahan", "12:31", "1402-03-14", "700000", "12"));
        flightSchedules.add(new FlightSchedule("WA-43", "Tehran", "Isfahan", "00:31", "1402-02-14", "1000000", "119"));
        flightSchedules.add(new FlightSchedule("AD-31", "Tehran", "Rasht", "09:00", "1402-02-10", "900000", "89"));
        flightSchedules.add(new FlightSchedule("MN-02", "KishIsland", "Isfahan", "10:45", "1402-01-02", "1300000", "8"));
        flightSchedules.add(new FlightSchedule("KA-12", "Tehran", "Qom", "11:30", "1402-02-01", "700000", "100"));
        flightSchedules.add(new FlightSchedule("BG-44", "Isfahan", "Mashhad", "12:40", "1402-01-20", "1500000", "87"));
        flightSchedules.add(new FlightSchedule("BG-71", "Mashhad", "Tehran", "01:40", "1402-03-12", "1500000", "77"));
        flightSchedules.add(new FlightSchedule("ZX-10", "Mashhad", "Isfahan", "13:50", "1402-03-09", "1300000", "137"));
        flightSchedules.add(new FlightSchedule("SE-11", "Shiraz", "Yazd", "10:00", "1402-01-08", "900000", "70"));
        flightSchedules.add(new FlightSchedule("HJ-11", "Tabriz", "Mashhad", "00:20", "1402-01-21", "1500000", "60"));
        flightSchedules.add(new FlightSchedule("GS-13", "Qom", "Tehran", "01:10", "1402-03-02", "500000", "17"));
        flightSchedules.add(new FlightSchedule("GZ-27", "Abadan", "Isfahan", "08:00", "1402-04-12", "1000000", "5"));
        flightSchedules.add(new FlightSchedule("JK-34", "Tehran", "Isfahan", "11:00", "1402-01-13", "1000000", "130"));
        flightSchedules.add(new FlightSchedule("SH-65", "Mashhad", "Isfahan", "17:20", "1402-01-20", "1500000", "67"));
        flightSchedules.add(new FlightSchedule("PL-19", "Rasht", "Tabriz", "00:00", "1402-02-22", "700000", "230"));
        flightSchedules.add(new FlightSchedule("RA-88", "Kerman", "Isfahan", "15:00", "1402-04-29", "1000000", "44"));
        flightSchedules.add(new FlightSchedule("YU-71", "KishIsland", "Tehran", "21:30", "1402-03-30", "1700,000", "117"));
        flightSchedules.add(new FlightSchedule("WZ-54", "Shiraz", "chabahar", "11:40", "1402-01-27", "800000", "90"));
        flightSchedules.add(new FlightSchedule("PO-56", "Ramsar", "Tehran", "08:30", "1402-03-10", "800000", "9"));


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
        printFlightSchedules();
        int indexNum;
        String[] informationArray = new String[7];
        String[] numberArray = new String[7];
        System.out.print("the ID of flight =");
        String flightID = get.next();
        for (int i = 0; i < flightSchedules.size(); i++) {
            String id = flightSchedules.get(i).getFlight();
            if (Objects.equals(id, flightID)) {
                indexNum = i;
                setOne(informationArray, indexNum, numberArray);
            }
        }


    }


    public void printFlightSchedules() {

        for (int i = 0; i < flightSchedules.size(); i++) {
            System.out.println(".....................................");
            System.out.println("Flight" + i + ")" + flightSchedules.get(i).toString());

        }
    }

    public void search(String[] returnArray, String[] fillArray, String[] searchArray) {

        fillForSearch(fillArray, searchArray);
        for (int i = 0; i < 7; i++) {
            if (!Objects.equals(fillArray[i], "")) {
                returnArray[i] = "1";
            } else {
                returnArray[i] = "0";
            }

        }


    }

    public void checkArraylist(String[] check, String[] information, int index, ArrayList<FlightSchedule> mainList, ArrayList<FlightSchedule> checklist) {

        if (Objects.equals(check[index], "1")) {
            for (FlightSchedule flightSchedule : mainList) {
                if (flightSchedule.toString().contains(information[index])) {
                    checklist.add(flightSchedule);
                }
            }
        } else if (Objects.equals(check[index], "0")) {
            checklist.addAll(mainList);
        }

    }

    public void check(String[] id) {
        addDefault();
        String[] checkString = new String[7];
        String[] checkArray = new String[7];
        String[] getInformation = new String[7];
        search(checkArray, getInformation, checkString);
        checkArraylist(checkArray, checkString, 0, flightSchedules, flightId);
        checkArraylist(checkArray, checkString, 1, flightId, origin);
        checkArraylist(checkArray, checkString, 2, origin, destination);
        checkArraylist(checkArray, checkString, 3, destination, time);
        checkArraylist(checkArray, checkString, 4, time, date);
        checkArraylist(checkArray, checkString, 5, date, price);
        checkArraylist(checkArray, checkString, 6, price, seats);
        for (FlightSchedule seat : seats) {
            System.out.println(seat.toString());
        }
        System.out.print("please enter the id of your intended flight :");
        id[0] = get.nextLine();
    }


    public void bookedTickets() {
        for (int i = 0; i < ticket.size(); i++) {

            if (i % 2 == 0) {
                System.out.println(ticket.get(i));
            } else {
                for (int j = 0; j < flightSchedules.size(); j++) {
                    if (Objects.equals(flightSchedules.get(j).getFlight(), ticket.get(i))) {
                        System.out.println(flightSchedules.get(j));
                    }
                }
                System.out.println("----------------------------------");
            }

        }
    }


    public void bookTicket(String[] flightId) {
        long x = 0;
        String flightID;
        flightID = flightId[0];
        flightID = flightID.toLowerCase();
        String ticketId = "FarazAir" + "00" + flightID;
        int possibility = checkCharge(flightId, x);
        if (possibility == 1) {
            ticket.add(ticketId);
            ticket.add(flightId[0]);

        } else {
            System.out.println("sorry your credit or the flight`s seats is not enough please check again ");
        }

    }

    public int checkCharge(String[] id, long charge) {
        int check = 0;

        for (int i = 0; i < flightSchedules.size(); i++) {
            if (Objects.equals(flightSchedules.get(i).getFlight(), id[0])) {
                long price = Integer.parseInt(flightSchedules.get(i).getPrice());
                int seats = Integer.parseInt(flightSchedules.get(i).getSeats());

                charge = users.returnCharge();


                if ((charge >= price) && (seats != 0)) {
                    check = 1;
                    String newSeats = String.valueOf(seats);
                    users.returnLastCharge(charge, price, 1);
                    returnSeats(newSeats, id[0]);

                } else {
                    check = 0;
                }
            }
        }
        return check;
    }

    public void cancellation() {
        bookedTickets();
        int x = 0;
        System.out.println("please choose the ticket you want to cancel:");
        String canceledId = get.nextLine();
        for (int i = 0; i < ticket.size(); i++) {
            if (i % 2 == 0) {
                if (Objects.equals(ticket.get(i), canceledId)) {
                    x = i;

                }
            }
        }
        ticket.remove(x);
        ticket.remove(x);
    }


    public void fill(String[] fillArray) {


        System.out.println("please fill the information you want");
        System.out.print("flightID :");
        fillArray[0] = get.nextLine();
        System.out.println();
        System.out.print("origin :");
        fillArray[1] = get.nextLine();
        System.out.println();
        System.out.print("destination :");
        fillArray[2] = get.nextLine();
        System.out.println();
        System.out.print("time :");
        fillArray[3] = get.nextLine();
        System.out.println();
        System.out.print("date :");
        fillArray[4] = get.nextLine();
        System.out.println();
        System.out.print("price :");
        fillArray[5] = get.nextLine();
        System.out.println();
        System.out.print("seats :");
        fillArray[6] = get.nextLine();

    }

    public void fillForSearch(String[] getInfoArray, String[] forSearchArray) {
        System.out.print("flightID :");
        getInfoArray[0] = get.nextLine();
        forSearchArray[0] = "flightID='" + getInfoArray[0] + '\'';
        System.out.print("origin :");
        getInfoArray[1] = get.nextLine();
        forSearchArray[1] = ", origin='" + getInfoArray[1] + '\'';
        System.out.print("destination :");
        getInfoArray[2] = get.nextLine();
        forSearchArray[2] = ", destination='" + getInfoArray[2] + '\'';
        System.out.print("time :");
        getInfoArray[3] = get.nextLine();
        forSearchArray[3] = ", time='" + getInfoArray[3] + '\'';
        System.out.print("date :");
        getInfoArray[4] = get.nextLine();
        forSearchArray[4] = ", date='" + getInfoArray[4] + '\'';
        System.out.print("price :");
        getInfoArray[5] = get.nextLine();
        forSearchArray[5] = ", price='" + getInfoArray[5] + '\'';
        System.out.print("seats :");
        getInfoArray[6] = get.nextLine();
        forSearchArray[6] = ", seats='" + getInfoArray[6] + '\'';

    }

    public void returnSeats(String seats, String flightId) {
        int integerValue = Integer.parseInt(seats);
        for (int i = 0; i < flightSchedules.size(); i++) {
            if (Objects.equals(flightSchedules.get(i).getFlight(), flightId)) {
                integerValue = integerValue - 1;
                seats = String.valueOf(integerValue);
                flightSchedules.get(i).setSeats(seats);
            }
        }


    }

    public void setItems(String[] fillInfo, String[] returnOne) {
        fill(fillInfo);
        setForUpdate(fillInfo, returnOne);

    }

    public void setForUpdate(String[] array, String[] newOne) {
        for (int i = 0; i < array.length; i++) {
            if (!Objects.equals(array[i], "")) {
                newOne[i] = "1";
            } else {
                newOne[i] = "0";
            }
        }
    }

    public void setOne(String[] information, int index, String[] array) {
        setItems(information, array);
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], "1")) {
                if (i == 0) {
                    flightSchedules.get(index).setFlightID(information[0]);
                } else if (i == 1) {
                    flightSchedules.get(index).setOrigin(information[1]);

                } else if (i == 2) {
                    flightSchedules.get(index).setDestination(information[2]);
                } else if (i == 3) {
                    flightSchedules.get(index).setTime(information[3]);
                } else if (i == 4) {
                    flightSchedules.get(index).setDate(information[4]);
                } else if (i == 5) {
                    flightSchedules.get(index).setPrice(information[5]);
                } else if (i == 6) {
                    flightSchedules.get(index).setSeats(information[6]);
                }
            }
        }
    }
}
