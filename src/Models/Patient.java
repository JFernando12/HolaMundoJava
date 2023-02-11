package Models;

import java.util.ArrayList;

public class Patient extends User{
    private int age;
    ArrayList<AppointmentPatient> appointmentsPatient = new ArrayList<>();

    public Patient(String name, String email) {
        super(name, email);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addAppointmentPatient(Doctor doctor, Appointment appointment) {
        AppointmentPatient newAppointmentPatient = new AppointmentPatient(doctor, appointment);
        appointmentsPatient.add(newAppointmentPatient);
    }

    public void getAppointmentsPatient() {
        for (int i = 0; i < appointmentsPatient.size(); i ++) {
            appointmentsPatient.get(i).getAppointmentPatient();
        }
    }
}
