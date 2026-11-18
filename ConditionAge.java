package tp2014;

public class ConditionAge implements ConditionAcces {
    private int ageMin;

    public ConditionAge(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMin() {
        return ageMin;
    }

    @Override
    public boolean accesPossible(Personne p) {
        return p.getAge() > ageMin;
    }

    @Override
    public String toString() {
        return "Age minimal : " + ageMin + " ans";
    }
}