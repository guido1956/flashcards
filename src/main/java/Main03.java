import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        FlashCard flashCard = maakEnVulFlashCard();
        oefenKaart(flashCard);
        toonKaart(flashCard);
    }

    private static FlashCard maakEnVulFlashCard() {
        FlashCard fc = new FlashCard();
        //inlezen invoer vraag en antwoord door de gebruiker
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de vraag in:");
        String vraag = scanner.nextLine();
        System.out.println("Voer het antwoord in:");
        String antwoord = scanner.nextLine();
        fc.setVoorkant(vraag);
        fc.setAchterkant(antwoord);
        fc.setGekend(false);  // hoeft eigenlijk niet default is boolean al false
        return fc;
    }

    private static void toonKaart(FlashCard fc) {
        System.out.println("vraag        : " + fc.getVoorkant());
        System.out.println("antwoord     : " + fc.getAchterkant());
        System.out.print(  "Kaart gekend : ");
        if (fc.isGekend()) {
            System.out.println("JA");
        } else {
            System.out.println("NEE");
        }
    }

    private static void oefenKaart(FlashCard fc) {
        boolean isOefenen = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Vraag: " + fc.getVoorkant());
            System.out.println("Toets Enter voor het antwoord");
            scanner.nextLine();
            System.out.println("Antwoord: " + fc.getAchterkant());
            System.out.println("Had je het antwoord goed j/n?");
            String goed = scanner.nextLine();
            if (goed.equals("j")) {
                fc.setGekend(true);
            } else {
                fc.setGekend(false);
            }
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




