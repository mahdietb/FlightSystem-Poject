import java.util.ArrayList;

public class Admins {
    private ArrayList<Admin> admins = new ArrayList<>();

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    /**
     * to check if admin arraylist is empty or not
     */
    public void beingEmpty() {
        if (admins.isEmpty()) {
            firstAdd();

        }
    }

    public void firstAdd() {
        admins.add(new Admin("mahdiehtb", "756402mt"));
    }

}
