// Deze file laat verschillende vormen van comments zien. Dit is een inline
// die start met twee //

/*
 *  Dit is multiline commentaar
 *  Javaprogrammeurs houden er van om commentaar beknopt te houden
 *  Liever duidelijke code die voor zichtzelf spreekt...
 */


/**
 * Een slash met twee sterren geeft multiline commentaar dat
 * ook bedoeld is als documentatie buiten de files.
 * Een tool javadoc -aanwezig- in IntelliJ maakt hier prachtige
 * documentatie van waarmee javaprogrammeurs erg vertrouwd zijn.
 * Dit blok boven een method zie blok boven main, geeft ook extra regels
 * die beginnen met een @
 */
public class DemoComments {
    /**
     * Commentaar voor javadoc
     * @param args
     */
    public static void main(String[] args) {
                                        // inline mag op witregel of na de ;
        System.out.println("" + 4 + 5); // pas op er komt 45 op console
        System.out.println(4 + 5);      // pas op er komt 9 op het console
        // System.out.println("Dit statement is even op nonactief gezet");
    }
}
