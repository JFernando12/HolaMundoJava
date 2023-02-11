package UI;

import Models.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    static int selector;
    static ArrayList<Patient> patients = new ArrayList<>();

    static void createPatients() {
        Patient patient1 = new Patient("Fernando", "fernando@gmail.com");
        Patient patient2 = new Patient("Luis", "luis@gmail.com");
        Patient patient3 = new Patient("Grecia", "grecia@gmail.com");

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
    }

    public static void showMenu() {
        createPatients();
        do {
            System.out.println("Seleccione que eres: ");
            System.out.println("1.- Doctor");
            System.out.println("2.- Patient");
            System.out.println("0.- Exit");
            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());
            switch (selector) {
                case 1:
                    System.out.println("Estoy en doctor");
                    break;
                case 2:
                    new UIPatient(patients.get(0)).showPatientMenu();
                    break;
                case 0:
                    System.out.println("Sali exitosamente");
                    break;
                default:
                    System.out.println("Elige una opcion correcta");
            }
        } while (selector != 0);
    }
}
