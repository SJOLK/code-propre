package ex3;

/**
 * Represente le concept d'animal
 */
public class Animal {
    /**
     * Nom de l'animal
     */
    private String nom;
    /**
     * Type de l'animal
     */
    private String type;
    /**
     *
     * Comportement
     */
    private String comportement;

    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Getter
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }
}
