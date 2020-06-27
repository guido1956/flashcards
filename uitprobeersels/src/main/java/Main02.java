import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de titel van je boek in");
        String titel = scanner.nextLine();
        System.out.println("Voer de naam van de auteur in");
        String auteur = scanner.nextLine();
        System.out.println("Voer het aantal bladzijden in");
        int aantalBladzijden = scanner.nextInt();
        Boek mijnBoek = new Boek(titel, auteur, aantalBladzijden);


        // test of boek goed is aangemaakt
        System.out.println("Titel: " + mijnBoek.getAantalBladzijden());
        System.out.println("Auteur: " + mijnBoek.getAuteur());
        System.out.println("Omvang: " + mijnBoek.getAantalBladzijden() + " bladzijden");
    }
}


