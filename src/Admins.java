import java.util.ArrayList;

public class Admins {
    private ArrayList<Admin> admins = new ArrayList<>();

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void Empty() {
        if (admins.isEmpty()) {
            firstAdd();

        }
    }
    public void firstAdd(){
        admins.add(new Admin("mahdiehtb","756402mt"));
    }

}
