package UI;

import java.util.Scanner;

public class UIMenu {
    static int selector;
    public static void showMenu() {
        do {
            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());
            switch (selector) {
                case 1:
                    System.out.println("Estoy en doctor");
                    break;
                case 2:
                    System.out.println("Estoy en paciente");
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
