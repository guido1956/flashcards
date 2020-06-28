import java.util.ArrayList;

public class FlashCards {
    private ArrayList<FlashCard> flashCards = new ArrayList<>();

    public FlashCards() {
    }

    public void addFlashCard(FlashCard fc) {
        addFlashCard(fc);
    }

    public int getAantalFlashCards() {
        return flashCards.size();
    }

    public FlashCard getFlashCard(int index) {
        return flashCards.get(index);
    }

    public void removeFlashCard(int index) {
        flashCards.remove(index);
    }
}
