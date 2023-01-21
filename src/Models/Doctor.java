package Models;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;
    public ArrayList<Appointment> appointments = new ArrayList<>();
    public Doctor(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void getAppointments() {
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(i + " - " + appointments.get(i).getDate() + " " + appointments.get(i).getTime());
        }
    }

    public void createAppointment(Date date, String time) {
        appointments.add(new Appointment(date, time));
    }
}
