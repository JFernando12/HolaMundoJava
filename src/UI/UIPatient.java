package UI;

import Models.Doctor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class UIPatient {
    private static int selector;
    private static Doctor doctor1 = new Doctor("Fernando", "fernando@gmail.com");
    private static Doctor doctor2 = new Doctor("Jose", "jose@gmail.com");
    private static Doctor doctor3 = new Doctor("Luis", "luis@gmail.com");

    private static ArrayList<Doctor> doctors = new ArrayList<>(Arrays.asList(doctor1, doctor2, doctor3));

    private static void creatingAppointments() {
        doctor1.createAppointment(new Date(), "1:00pm");
        doctor1.createAppointment(new Date(), "2:00pm");
        doctor2.createAppointment(new Date(), "3:00pm");
        doctor2.createAppointment(new Date(), "4:00pm");
        doctor3.createAppointment(new Date(), "5:00pm");
        doctor3.createAppointment(new Date(), "6:00pm");
    }

    public static void showDoctors() {
        creatingAppointments();
        int selectDoctor = 0;
        int doctorsSize = doctors.size();
        do {
            System.out.println("Select a doctor: ");
            for (int i = 0; i < doctorsSize; i++) {
                System.out.println(i + " - " + doctors.get(i).getName());
            }
            System.out.println("100 - Exit");

            Scanner sc = new Scanner(System.in);
            selectDoctor = Integer.parseInt(sc.nextLine());

            if(selectDoctor == 100) {
                System.out.println("Exit...");
            } else if (selectDoctor >= doctorsSize || selectDoctor < 0) {
                System.out.println("Select a correct option");
            } else {
                showAppointments(selectDoctor);
            }

        } while (selectDoctor != 100);
    }

    public static void showAppointments(int index) {
        doctors.get(index).getAppointments();
    }

    public static void showMyAppointments() {
        System.out.println("My appointments");
    }

    public static void showPatientMenu() {
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
                    showMyAppointments();
                    break;
                case 0:
                    System.out.println("Exit..");
                    break;
                default:
                    System.out.println("Select a correct option");
                    break;
            }
        } while (selector != 0);
    }
}