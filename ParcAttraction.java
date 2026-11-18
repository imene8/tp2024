package tp2014;

public class ParcAttraction {
    private String nom;
    private Attraction[] lesAttractions;
    private int taille;
    private int nb_attraction;

    public ParcAttraction(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
        this.lesAttractions = new Attraction[taille];
        this.nb_attraction = 0;
    }

    public void ajouteAttraction(Attraction a) {
        if (nb_attraction < taille) {
            lesAttractions[nb_attraction] = a;
            nb_attraction++;
        } else {
            System.out.println("Erreur : le parc est plein, impossible d'ajouter l'attraction.");
        }
    }

    public float getRecette() {
        float total = 0;
        for (int i = 0; i < nb_attraction; i++) {
            total += lesAttractions[i].getRecette();
        }
        return total;
    }

    public void affiche() {
        System.out.println("Parc : " + nom);
        for (int i = 0; i < nb_attraction; i++) {
            Attraction a = lesAttractions[i];
            System.out.println("Attraction : " + a.getNom()
                    + " | Condition : " + a.getCondition()
                    + " | Recette : " + a.getRecette() + " DT");
        }
    }
}