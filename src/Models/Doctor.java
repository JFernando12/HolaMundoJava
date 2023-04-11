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
            System.out.println((i + 1) + " - " + appointments.get(i).getDay() + " " + appointments.get(i).getTime());
        }
    }

    public Appointment getAppointment(int index) {
        return appointments.get(index);
    }

    public void createAppointment(String day, String time) {
        appointments.add(new Appointment(day, time));
    }
}
