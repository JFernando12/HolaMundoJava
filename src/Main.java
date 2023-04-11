import Models.Doctor;
import UI.UIDoctor;
import UI.UIMenu;
import UI.UIPatient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        UIMenu.createPatients();
        UIDoctor.creatingAppointments();
        UIMenu.showMenu();
    }
}
