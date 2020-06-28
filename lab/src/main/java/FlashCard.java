public class FlashCard {
    private String voorkant;
    private String achterkant;
    private boolean isGekend;
    //constructor 1
    public FlashCard() {
        this("","");
    }

    // constructor 2
    public FlashCard(String voorkant, String achterkant) {
        this.voorkant = voorkant;
        this.achterkant = achterkant;
    }
    public String getVoorkant() {
        return voorkant;
    }

    public void setVoorkant(String voorkant) {
        this.voorkant = voorkant;
    }
    public String getAchterkant() {
        return achterkant;
    }
    public void setAchterkant(String achterkant) {
        this.achterkant = achterkant;
    }
    public boolean isGekend() {
        return isGekend;
    }
    public void setGekend(boolean gekend) {
        isGekend = gekend;
    }
}


