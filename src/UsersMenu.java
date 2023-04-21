import java.util.Objects;

public class UsersMenu {

    private Tickets tickets=new Tickets();
    private Flights flights=new Flights();
    private Users users=new Users();
    private Fill fill=new Fill();
    public void userMenu() {
        for (int i = 0; i < 30; i++) {
            System.out.print(":");
        }
        System.out.println();
        System.out.println("PASSENGER MENU OPTIONS");
        for (int i = 0; i < 30; i++) {
            System.out.print(":");
        }
        System.out.println();
        for (int i = 0; i < 30; i++) {
            System.out.print(".");
        }
        System.out.println();
        System.out.println("<1> Change Password");
        System.out.println("<2> Search Flight Tickets");
        System.out.println("<3> Booking Ticket");
        System.out.println("<4> Ticket Cancellation");
        System.out.println("<5> Booked Tickets");
        System.out.println("<6> Add Charge");
        System.out.println("<0> Sign out");
    }
    public void enteringUserMenu(String name) {
        String canceledId=null;
        String option = null;
        String[] checkId = new String[1];
        int flag = 0;
        while (flag == 0) {
            userMenu();
            System.out.println("option =");
            option = fill.get(option);
            if (Objects.equals(option, "0") || Objects.equals(option, "1") || Objects.equals(option, "2") || Objects.equals(option, "3") || Objects.equals(option, "4") || Objects.equals(option, "5") || Objects.equals(option, "6")) {
                switch (option) {
                    case "1":
                        users.changePassword();
                        break;
                    case "2":
                        flights.check(checkId);
                        break;
                    case "3":
                        tickets.bookTicket(checkId);
                        break;
                    case "4":

                        tickets.cancellation(canceledId,name);
                        break;
                    case "5":
                        tickets.bookedTickets(name);
                        break;
                    case "6":
                        users.addCharge();
                        break;
                    case "0":
                        flag = 1;
                        break;
                }
            }


        }


    }

}
