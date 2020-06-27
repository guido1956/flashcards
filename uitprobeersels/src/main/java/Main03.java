

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        FlashCardUS01 flashCardUS01 = new FlashCardUS01("Hoeveel verschillende lussen zijn er?",
                                             "4");
        boolean isOefenen = true;
        Scanner scanner = new Scanner(System.in);
        do {
            // Aantal statements zijn weggelaten
            System.out.println("Wil je nog een keer oefenen? j/n");
            String doorgaan = scanner.nextLine();
            if (doorgaan.equals("n")) {
                isOefenen = false;
            }
        } while (isOefenen);
        System.out.println("Je bent gestopt met oefenen");
    }
}





