import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        int aantalFlashCards = 2;
        FlashCard[] flashCards = maakEnVulFlashCards(aantalFlashCards);
        toonKaarten(flashCards);
    }
    private static FlashCard[] maakEnVulFlashCards(int aantal) {
        FlashCard[] fc = new FlashCard[aantal];
        Scanner scanner = new Scanner(System.in);
        for (int x = 0 ; x < aantal; x++) {
            System.out.println("Voer de vraag in voor kaart: " + (x+1));
            String vraag = scanner.nextLine();
            System.out.println("Voer het antwoord in:");
            String antwoord = scanner.nextLine();
            fc[x] = new FlashCard(vraag, antwoord);
        }
        return fc;
    }

    private static void toonKaarten(FlashCard[] fcs) {
        for (FlashCard fc : fcs  ) {
            System.out.println("vraag     : " + fc.getVoorkant());
            System.out.println("antwoord  : " + fc.getAchterkant());
            System.out.print("Kaart gekend: ");
            if (fc.isGekend()) {
                System.out.println("JA");
            } else {
                System.out.println("NEE");
            }
        }
    }
}




