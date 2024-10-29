package ex2;

public class TestCompteBancaire {

    public static void main(String[] args) {
        // Création d'un compte bancaire courant avec un solde de 1000 et un découvert autorisé de 500
        CompteBancaire compteCourant = new CompteBancaire(1000, 500);

        // Création d'un livret A avec un solde de 2000 et un taux de rémunération de 2%
        LivretA livretA = new LivretA(2000, 2);

        // Tests pour Compte Courant
        System.out.println("=== Tests pour Compte Courant ===");
        System.out.println("Solde initial : " + compteCourant.getSolde());

        // Dépôt de 200
        compteCourant.ajouterMontant(200);
        System.out.println("Après dépôt de 200, solde : " + compteCourant.getSolde());

        // Débit de 1500 (devrait être autorisé car dans la limite du découvert)
        compteCourant.debiterMontant(1500);
        System.out.println("Après retrait de 1500, solde : " + compteCourant.getSolde());

        // Tentative de retrait de 500 supplémentaire (devrait être refusé car dépasse le découvert autorisé)
        compteCourant.debiterMontant(500);
        System.out.println("Après tentative de retrait de 500 supplémentaire, solde : " + compteCourant.getSolde());

        // Tests pour Livret A
        System.out.println("\n=== Tests pour Livret A ===");
        System.out.println("Solde initial : " + livretA.getSolde());

        // Dépôt de 500
        livretA.ajouterMontant(500);
        System.out.println("Après dépôt de 500, solde : " + livretA.getSolde());

        // Tentative de retrait de 3000 (devrait être refusé car dépasse le solde)
        livretA.debiterMontant(3000);
        System.out.println("Après tentative de retrait de 3000, solde : " + livretA.getSolde());

        // Retrait de 1000 (autorisé car solde suffisant)
        livretA.debiterMontant(1000);
        System.out.println("Après retrait de 1000, solde : " + livretA.getSolde());

        // Application de la rémunération annuelle (solde doit augmenter selon le taux de 2%)
        livretA.appliquerRemunerationAnnuelle();
        System.out.println("Après application de la rémunération annuelle, solde : " + livretA.getSolde());
    }
}
