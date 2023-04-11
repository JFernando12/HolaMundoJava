package UI;

import Models.Appointment;
import Models.Doctor;
import Models.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class UIPatient {
    private static Patient patient;

    private static final ArrayList<Doctor> doctors = UIDoctor.doctors;

    public static void showDoctors() {
        int selectDoctor;
        int doctorsSize = doctors.size();
        do {
            System.out.println("Select a doctor: ");
            for (int i = 0; i < doctorsSize; i++) {
                System.out.println((i + 1) + " - " + doctors.get(i).getName());
            }
            System.out.println("0 - Exit");

            Scanner sc = new Scanner(System.in);
            selectDoctor = Integer.parseInt(sc.nextLine());

            if(selectDoctor > 0 && selectDoctor < doctorsSize + 1) {
                selectDoctor = showAppointments(selectDoctor - 1);
            } else if(selectDoctor == 0) {
                System.out.println("Exit...");
            } else {
                System.out.println("Select a correct option.");
            }

        } while (selectDoctor != 0);
    }

    public static int showAppointments(int index) {
        int selectorAppo;
        Doctor currentDoctor = doctors.get(index);
        int appointmentsSize = currentDoctor.appointments.size();

        do {
            System.out.println("Appointments:  ");
            doctors.get(index).getAppointments();
            System.out.println("0 - Exit");
            Scanner sc = new Scanner(System.in);
            selectorAppo = Integer.parseInt(sc.nextLine());

            if(selectorAppo > 0 && selectorAppo < appointmentsSize + 1) {
                patient.addAppointmentPatient(currentDoctor, currentDoctor.getAppointment(selectorAppo - 1));
                System.out.println("Appointment scheduled correctly.");
                selectorAppo = 0;
            } else if (selectorAppo == 0) {
                System.out.println("Exit...");
            } else {
                System.out.println("Select a correct option.");
            }
        } while (selectorAppo != 0);
        return 0;
    }

    public static void showMyAppointments(Patient patient) {
        int selectorMyAppo;
        do {
            System.out.println("My appointments");
            patient.getAppointmentsPatient();
            System.out.println("0 - Exit");
            Scanner sc = new Scanner(System.in);
            selectorMyAppo = Integer.parseInt(sc.nextLine());
        } while (selectorMyAppo != 0);
    }

    public static void showPatientMenu(Patient patient) {
        UIPatient.patient = patient;
        int selector;
        do {
            System.out.println("Select an option");
            System.out.println("1.- Create appointment");
            System.out.println("2.- See my appointments");
            System.out.println("0.- Exit");

            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());

            switch (selector) {
                case 1:
                    showDoctors();
                    break;
                case 2:
                    showMyAppointments(patient);
                    break;
                case 0:
                    System.out.println("Exit..");
                    break;
                default:
                    System.out.println("Select a correct option.");
                    break;
            }
        } while (selector != 0);
    }
}