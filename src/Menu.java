import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    Scanner get = new Scanner(System.in);


    private Users users;
    private Flights flights = new Flights();

    public int printWelcomeMenu() {
        for (int i = 0; i < 47; i++) {
            System.out.print(":");
        }
        System.out.println();
        System.out.println("    WELCOME TO AIRLINE RESERVATION SYSTEM");
        for (int i = 0; i < 47; i++) {
            System.out.print(":");
        }
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < 15; i++) {
            System.out.print(".");

        }
        System.out.print("MENU OPTION");
        for (int i = 0; i < 15; i++) {
            System.out.print(".");

        }
        System.out.println();
        System.out.println("<1> sign up");
        System.out.println("<2> sign in");
        System.out.print("option = ");
        int option = get.nextInt();
        return option;
    }

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
            System.out.println(".");
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


    public int mainMenu() {

        int x = printWelcomeMenu();


        while (x != 3) {

            switch (x) {

                case 1:
                    users.signUp();

                    break;


                case 2:
                    users.signIn();
                    break;


            }

            x = printWelcomeMenu();


        }
        return x;

    }


//    public void p(){
//        System.out.print("username = ");
//        String username =get.next();
//        if(Objects.equals(username, admin.getUserName())){
//            adminMenu();
//        }
//    }

    public void enteringAdminMenu() {

        int flag = 0;
        flights.addDefault();
        while (flag == 0) {

            adminMenu();
            int choice;
            System.out.print("choice =");
            choice = get.nextInt();

            switch (choice) {
                case 1:
                    flights.addFlight();
                    break;
                case 2:
                    flights.updateFlight();
                    break;
                case 3:
                    flights.removeFlight();
                    break;
                case 4:
                    flights.printFlightSchedules();
                    break;
                case 0:
                    flag = 1;
            }
        }


    }

    public void enteringUserMenu() {
        int option;
        userMenu();
        System.out.println("option =");
        option = get.nextInt();

        int flag = 0;
        while (flag == 0) {
            userMenu();
            System.out.println("option =");
            option = get.nextInt();

            switch (option) {
                case 1:
                    users.changePassword();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    users.addCharge();
                    break;
                case 0:
                    flag = 1;
                    break;
            }


        }


    }


}













