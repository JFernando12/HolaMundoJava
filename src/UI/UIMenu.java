package UI;

import java.util.Scanner;

public class UIMenu {
    static int selector;
    public static void showMenu() {
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
                    UIPatient.showPatientMenu();
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
