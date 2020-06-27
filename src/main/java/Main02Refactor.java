import java.util.Scanner;

public class Main02Refactor {
    public static void main(String[] args) {
        // Eerst lege flashcard aanmaken
        FlashCard mijnFlashCard = new FlashCard();

        //Voorkant en achterkant tonen
        toonKaart(mijnFlashCard);

        //inlezen invoer vraag en antwoord door de gebruiker
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de vraag in:");
        String vraag = scanner.nextLine();
        System.out.println("Voer het antwoord in:");
        String antwoord = scanner.nextLine();

        //Flashcard voorzien van de ingevoerde waarden
        mijnFlashCard.setVoorkant(vraag);
        mijnFlashCard.setAchterkant(antwoord);

        //Voorkant en achterkant tonen
        toonKaart(mijnFlashCard);


    }

    private static void toonKaart(FlashCard fc) {
        System.out.println("vraag    : " + fc.getVoorkant());
        System.out.println("antwoord :"  + fc.getAchterkant());
    }
}


