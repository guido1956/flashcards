public class Voorbeeld {

    public static void main(String[] args) {
        Boek mijnBoek = new Boek("Java", "J.Jansen", 300);
        toonBoek(mijnBoek);
        String indicatie = toonIndicatieOmvang(mijnBoek.getAantalBladzijden());
        System.out.println("Het boek getiteld " + mijnBoek.getTitel() + " is " + indicatie);
    }

    private static void toonBoek(Boek boek) {
        System.out.println("***************");
        System.out.println("titel:  " + boek.getTitel());
        System.out.println("auteur: " + boek.getAuteur());
        System.out.println("omvang: " + boek.getAantalBladzijden());
        System.out.println("***************");
    }

    private static String toonIndicatieOmvang(int aantalBlz) {
        String indicatieOmvang = "";
        if (aantalBlz < 50) {
            indicatieOmvang = "zeer dun";
        }
        if (aantalBlz >= 50 && aantalBlz <= 150) {
            indicatieOmvang = "medium";
        } else {
            indicatieOmvang = "dik";
        }
        return indicatieOmvang;
     }
}





