package Models;

public class AppointmentPatient {
    Doctor doctor;
    Appointment appointment;

    AppointmentPatient(Doctor doctor, Appointment appointment) {
        this.doctor = doctor;
        this.appointment = appointment;
    }

    public void getAppointmentPatient() {
        System.out.println(doctor.getName() + "- " + appointment.getDay() + "-" + appointment.getTime());
    }
}
