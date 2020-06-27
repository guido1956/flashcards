import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        // Eerst lege flashcard aanmaken
        FlashCard mijnFlashCard = new FlashCard();

        //Voorkant en achterkant tonen
        System.out.println("vraag    : " + mijnFlashCard.getVoorkant());
        System.out.println("antwoord :"  + mijnFlashCard.getAchterkant());

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
        System.out.println("vraag    : " + mijnFlashCard.getVoorkant());
        System.out.println("antwoord :"  + mijnFlashCard.getAchterkant());
    }
}


