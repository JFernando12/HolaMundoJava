package UI;

import Models.Appointment;
import Models.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class UIDoctor {
    public static ArrayList<Doctor> doctors = new ArrayList<>();
    private static final Doctor doctor1 = new Doctor("Fernando", "fernando@gmail.com");
    private static final Doctor doctor2 = new Doctor("Jose", "jose@gmail.com");
    private static final Doctor doctor3 = new Doctor("Luis", "luis@gmail.com");
    public static void creatingAppointments() {
        doctor1.createAppointment("Monday", "1:00pm");
        doctor1.createAppointment("Tuesday", "2:00pm");
        doctor2.createAppointment("Wednesday", "3:00pm");
        doctor2.createAppointment("Sunday", "4:00pm");
        doctor3.createAppointment("Saturday", "5:00pm");
        doctor3.createAppointment("Monday", "6:00pm");

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
    }
    public static void showDoctorMenu() {
        int selector = 0;
        do {
            System.out.println("Elige una opcion");
            System.out.println("1.- Ya estoy registrado");
            System.out.println("2.- Registrarme");
            System.out.println("0.- Salir");

            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());
            if(selector == 1) {
                showDoctors();
            }
            if(selector == 2) {
                createDoctor();
            }
        } while (selector != 0);

    }
    private static void showDoctors() {
        int selector = 0;
        do{
            doctors.forEach(doctor -> System.out.println(doctors.indexOf(doctor) + 1 + "-" + doctor.getName()));
            System.out.println("0.- Exit");
            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());
            if(selector > 0 && selector <= doctors.size()) {
                showDoctorOptions(selector - 1);
            }
        }while(selector != 0);
    }
    private static void showDoctorOptions(int index) {
        int selector = 0;
        do {
            System.out.println("1.- See my appointments");
            System.out.println("2.- Create new appointment");
            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());

            if(selector == 1) {
                showAppointments(index);
            }
            if(selector == 2) {
                createAppointment(index);
            }
        } while (selector != 0);
    }
    private static void showAppointments(int index) {
        int selector;
        do {
            doctors.get(index).getAppointments();
            System.out.println("0.- Exit");
            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());
        } while(selector != 0);
    }
    private static void createAppointment(int index) {
        System.out.println("Creando fecha disponible");
        System.out.println("Introduce el dia: ");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        System.out.println("Introduce la hora: ");
        sc = new Scanner(System.in);
        String time = sc.nextLine();
        doctors.get(index).createAppointment(day, time);
    }
    public static void createDoctor() {
        System.out.println("Introduce tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Introduce tu email: ");
        sc = new Scanner(System.in);
        String email = sc.nextLine();
        Doctor doctor = new Doctor(name, email);
        doctors.add(doctor);
    }
}
