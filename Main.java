package tp2014;

public class Main {
    public static void main(String[] args) {
        ParcAttraction parc = new ParcAttraction("Carthage Land", 2);

        Attraction a1 = new Attraction("Montagnes russes", 5.0f, new ConditionAge(12));
        Attraction a2 = new Attraction("Carrousel", 2.5f, new ConditionAge(3));
        parc.ajouteAttraction(a1);
        parc.ajouteAttraction(a2);
        parc.ajouteAttraction(new Attraction("Bateau", 3f, new ConditionAge(8))); // message d'erreur

        Personne p1 = new Personne("Ali", 15, 170);
        Personne p2 = new Personne("Sarra", 6, 110);

        if (!a1.utilise(p1)) System.out.println("Acces interdit pour " + p1.getNom());
        if (!a2.utilise(p2)) System.out.println("Acces interdit pour " + p2.getNom());
        if (!a1.utilise(p2)) System.out.println("Acces interdit pour " + p2.getNom());

        parc.affiche();
        System.out.println("Recette totale : " + parc.getRecette() + " DT");
    }
}