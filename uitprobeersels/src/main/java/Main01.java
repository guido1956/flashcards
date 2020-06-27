public class Main01 {
    public static void main(String[] args) {
        Boek boek1 = new Boek("Java voor starters" , "J.Jansen", 725);
        System.out.println("Boek 1 heeft als titel: " + boek1.getTitel());
        System.out.println("Boek 1 heeft: " + boek1.getAantalBladzijden() + " bladzijden");
        int benOpPagina = 322;
        System.out.println("Ik moet nog " + boek1.nogTeLezen(benOpPagina) + " bladzijden lezen");
    }
}



