import java.util.Objects;
import java.util.Scanner;

public class AdminMenu {
    Scanner get = new Scanner(System.in);
    Flights flights = new Flights();

    /**
     * this Method prints the adminMenu
     */
    public void adminMenu() {
        for (int i = 0; i < 28; i++) {
            System.out.print(":");
        }
        System.out.println();
        System.out.println("ADMIN MENU OPTIONS");
        for (int i = 0; i < 28; i++) {
            System.out.print(":");
        }
        System.out.println();
        for (int i = 0; i < 28; i++) {
            System.out.print(".");
        }
        System.out.println();
        System.out.println("<1> Add");
        System.out.println("<2> Update");
        System.out.println("<3> Remove");
        System.out.println("<4> Flight Schedules");
        System.out.println("<0> Sign out");
    }

    /**
     * for entering the admin meu to see its option
     */
    public void enteringAdminMenu() {
        String choice;
        int flag = 0;
        String[] info = new String[7];
        String removeId;
        String updateId;
        flights.checkData();
        while (flag == 0) {
            adminMenu();
            System.out.print("choice =");
            choice = get.next();
            if (Objects.equals(choice, "0") || Objects.equals(choice, "1") || Objects.equals(choice, "2") || Objects.equals(choice, "3") || Objects.equals(choice, "4")) {
                switch (choice) {
                    case "1" -> flights.addFlight(info);
                    case "2" -> {
                        flights.printFlightSchedules();
                        System.out.print("the intended flightId =");
                        updateId = get.next();
                        flights.updateFlight(updateId);
                    }
                    case "3" -> {
                        flights.printFlightSchedules();
                        System.out.print("the intended flightId =");
                        removeId = get.next();
                        flights.removeFlight(removeId);
                    }
                    case "4" -> flights.printFlightSchedules();
                    case "0" -> flag = 1;
                }
            }
        }
    }
}
