package tp2014;

public class AccesInterditException extends Exception {

    public AccesInterditException() {
        super("Acces interdit : la personne ne respecte pas la condition d'acces a l'attraction.");
    }

    public AccesInterditException(String message) {
        super(message);
    }
}