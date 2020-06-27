public class Boek {
    // attributen
    private String titel;
    private String auteur;
    private int aantalBladzijden;

    // constructor
    public Boek(String titel, String auteur, int aantalBladzijden) {
        this.titel = titel;
        this.auteur = auteur;
        this.aantalBladzijden = aantalBladzijden;
    }

    // getters en setters
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public int getAantalBladzijden() {
        return aantalBladzijden;
    }
    public void setAantalBladzijden(int aantalBladzijden) {
        this.aantalBladzijden = aantalBladzijden;
    }

    // Berekenen nog te lezen pagina's
    public int nogTeLezen(int huidigePagina) {
        return this.aantalBladzijden - huidigePagina;
    }
}


