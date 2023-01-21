import Models.Doctor;
import UI.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        UIMenu.showMenu();
        Doctor myDoctor = new Doctor("Fernando", "fernando@gmail.com");
        System.out.println(myDoctor.getName());

        myDoctor.createAppointment(new Date(), "3:00");
        myDoctor.createAppointment(new Date(), "5:00");
        myDoctor.createAppointment(new Date(), "7:00");

        myDoctor.getAppointments();
    }
}
