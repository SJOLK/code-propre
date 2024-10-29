package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Cette classe représente une entreprise avec des informations telles que le numéro SIRET, le nom, l'adresse et la date de création.
 */
public class Entreprise {

	/**
	 * Le numéro SIRET unique identifiant l'entreprise.
	 */
	private int siret;

	/**
	 * Le nom de l'entreprise.
	 */
	private String nom;

	/**
	 * L'adresse de l'entreprise.
 	 */
	private String adresse;

	/**
	 * La date de création de l'entreprise.
	 */
	private Date dateCreation;

	/**
	 *  Le capital maximal autorisé pour une entreprise.
	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise.
	 */
	public void afficherStatut() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = dateFormat.format(dateCreation);

		System.out.println("Statut de l'entreprise :");
		System.out.println("Numéro SIRET : " + siret);
		System.out.println("Nom de l'entreprise : " + nom);
		System.out.println("Adresse : " + adresse);
		System.out.println("Date de création : " + dateFormatee);
		System.out.println("Capital maximal autorisé : " + CAPITAL_MAX + " €");
	}

	// Getters et Setters pour l'encapsulation


	/**
	 * Getter
	 * @return siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 * @param siret siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * @param adresse adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 * @param dateCreation dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
