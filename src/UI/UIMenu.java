package UI;

import java.util.Scanner;

public class UIMenu {
    static int selector;
    public static void showMenu() {
        do {
            Scanner sc = new Scanner(System.in);
            selector = Integer.parseInt(sc.nextLine());
        } while (selector != 0);
    }
}
