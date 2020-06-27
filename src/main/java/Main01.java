public class Main01 {
    public static void main(String[] args) {
        FlashCard flascard1 = new FlashCard("Wat is meestal het eerste programma?",
                                            "Hello World! ");
        System.out.println("Voorkant flashcard1   : " + flascard1.getVoorkant());
        System.out.println("Achterkant flashcard1 : " + flascard1.getAchterkant());

        FlashCard flashCard2 = new FlashCard();
        System.out.println("Voorkant flashcard2   : " + flashCard2.getVoorkant());
        System.out.println("Achterkant flashcard2 : " + flashCard2.getAchterkant());
    }
}






