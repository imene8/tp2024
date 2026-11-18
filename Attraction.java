package tp2014;
public class Attraction {
    private String nom;
    private float cout;
    private ConditionAge condition;
    private int nbPersonnes;
    private float recette;

    public Attraction(String nom, float cout, ConditionAge condition) {
        this.nom = nom;
        this.cout = cout;
        this.condition = condition;
        this.nbPersonnes = 0;
        this.recette = 0;
    }

    public String getNom() {
        return nom;
    }

    public ConditionAge getCondition() {
        return condition;
    }

    public float getRecette() {
        return recette;
    }

    public void affiche() {
        System.out.println("Attraction : " + nom);
        System.out.println("Cout : " + cout + " DT");
        System.out.println("Condition d'acces : " + condition);
        System.out.println("Nombre de personnes : " + nbPersonnes);
        System.out.println("Recette : " + recette + " DT");
    }

    public boolean utilise(Personne p) {
        if (!condition.accesPossible(p)) {
            return false;
        }
        nbPersonnes++;
        recette += cout;
        return true;
    }
}