package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    /**
     * Nom
     */
    private String nom;
    /**
     * Liste d'animaux
     */
    private List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animaux.add(animal);
    }

    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    public int taille() {
        return animaux.size();
    }

    /**
     * Getter
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}