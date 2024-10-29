package ex2;

/**
 * Classe représentant un livret A, un type de compte bancaire sans découvert et avec un taux de rémunération annuel.
 */
public class LivretA extends CompteBancaire {

	/** Taux de rémunération annuel du livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur pour initialiser un livret A avec un solde et un taux de rémunération.
	 * @param solde le solde initial du livret A
	 * @param tauxRemuneration le taux de rémunération annuel
	 */
	public LivretA(String type ,double solde, double tauxRemuneration) {
		super("LA", solde, 0); // Aucun découvert autorisé pour un livret A
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Débite un montant du livret A en s'assurant que le solde reste positif.
	 * @param montant le montant à débiter
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant >= 0) {
			this.solde -= montant;
		} else {
			System.out.println("Débit impossible : le solde est insuffisant.");
		}
	}

	/**
	 * Applique la rémunération annuelle sur le solde du livret A.
	 */
	public void appliquerRemunerationAnnuelle() {
		this.solde += this.solde * tauxRemuneration / 100;
	}

	/**
	 * Retourne le taux de rémunération du livret A.
	 * @return le taux de rémunération
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Définit le taux de rémunération du livret A.
	 * @param tauxRemuneration le nouveau taux de rémunération
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
