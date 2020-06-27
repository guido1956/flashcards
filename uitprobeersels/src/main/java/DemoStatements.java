public class DemoStatements {
    public static void main(String[] args) {
        String titel = "Boek alfa";
        titel = "Mijn boek heet " + titel;
        int aantalTekensInBoek = titel.length();
        System.out.println(aantalTekensInBoek);
        if (aantalTekensInBoek > 20) {
            System.out.println("Dit is een lange tekst");
        }
    }
}


