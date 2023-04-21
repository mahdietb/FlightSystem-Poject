import java.util.ArrayList;
import java.util.Objects;

public class Tickets {
    private Flights flights = new Flights();
    private  ArrayList<Ticket> tickets = new ArrayList<>();
    private Users users = new Users();
    private Fill fill = new Fill();


    public void bookTicket(String[] flightId) {
        long x = 0;
        if (flightId[0] != null) {
            String flightID;
            flightID = flightId[0];
            flightID = flightID.toLowerCase();
            String ticketId = "FarazAir" + "00" + flightID;
            int possibility = flights.checkCharge(flightId, x);
            if (possibility == 1) {
                Ticket ticket = new Ticket();
                ticket.data(ticketId, flightId[0], Users.getName().get(0));
                tickets.add(ticket);
                flights.getSoldOut().add(flightId[0]);
                flights.getSoldOut().add(Users.getName().get(0));
            } else {
                System.out.println("sorry your credit or the flight`s seats is not enough please check again ");
            }
        } else {
            System.out.println("sorry you first have to choose your intended flight in a search part");
        }

    }

    public void bookedTickets(String name) {


        for (int i = 0; i < tickets.size(); i++) {

            if (Objects.equals(tickets.get(i).getUserName(), name)) {
                System.out.println(tickets.get(i).getTicketId());

                for (int j = 0; j < flights.getFlightSchedules().size(); j++) {
                    if (Objects.equals(flights.getFlightSchedules().get(j).getFlight(), tickets.get(i).getFlightId())) {
                        System.out.println(flights.getFlightSchedules().get(j));


                    }
                }
                System.out.println("----------------------------------");


            }
        }
    }

    public void cancellation(String canceledId, String name) {
        bookedTickets(name);

        System.out.println("please choose the ticket you want to cancel:");
        canceledId = fill.get(canceledId);
        returnCharge(canceledId, name);
        for (int i = 0; i < tickets.size(); i++) {

            if (Objects.equals(tickets.get(i).getFlightId(), canceledId) && Objects.equals(tickets.get(i).getUserName(), name)) {
                System.out.println(tickets.get(i).getUserName());
                System.out.println(name);
                String finalCanceledId = canceledId;
                tickets.removeIf(n ->(n.getFlightId().contains(finalCanceledId)&& Objects.equals(n.getUserName(), name)));
                flights.getSoldOut().removeIf(n ->(n.contains(finalCanceledId)));
            }

        }




    }

    public void returnCharge(String flightId, String name) {
        long returnCharge;
        String returnSeat;
        int newSeats;
        long newCharge;
        for (int i = 0; i < users.getUsers().size(); i++) {
            if (Objects.equals(users.getUsers().get(i).getUserName(), name)) {
                for (int j = 0; j < tickets.size(); j++) {
                    if (Objects.equals(tickets.get(j).getFlightId(), flightId)) {
                        for (int k = 0; k < flights.getFlightSchedules().size(); k++) {
                            if (Objects.equals(flights.getFlightSchedules().get(k).getFlight(), flightId)) {
                                returnCharge = Integer.parseInt(flights.getFlightSchedules().get(k).getPrice());
                                newCharge = users.getUsers().get(i).getCharge();
                                newCharge = newCharge + returnCharge;
                                users.getUsers().get(i).setCharge(newCharge);
                                returnSeat = flights.getFlightSchedules().get(k).getSeats();
                                newSeats = Integer.parseInt(returnSeat) + 1;
                                returnSeat = String.valueOf(newSeats);
                                flights.getFlightSchedules().get(k).setSeats(returnSeat);
                            }
                        }
                    }
                }
            }
        }


    }
}
