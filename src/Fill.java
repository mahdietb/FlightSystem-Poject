import java.util.Scanner;

public class Fill {
    Scanner get = new Scanner(System.in);

    /**
     * this Method gets the info that we want
     * @param getInfoArray get the information
     * @param forSearchArray turn the given info to existent data in arrayList
     */
    public void fillForSearch(String[] getInfoArray, String[] forSearchArray) {
        get.nextLine();
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

    /**
     * simply get the information and save it in array
     * @param fillArray for saving info
     */
    public void fill(String[] fillArray) {
        get.nextLine();
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

    public String get(String info) {
        info = get.nextLine();
        return info;
    }

    public long get(long info) {
        info = get.nextLong();
        return info;
    }
}
