import java.time.LocalDate;

public class Sighting implements Describable {

    protected String species;
    protected int count;
    protected LocalDate when;
    protected String notes;

    public Sighting(String species, int count, LocalDate when) {
        this(species, count, when, "");
    }

    public Sighting(String species, int count, LocalDate when, String notes) {
        this.species = species;
        this.count = count;
        this.when = when;
        this.notes = notes;
    }

    public String describe() {
        return String.format("%dx %s on %s", count, species, when);
    }

    public LocalDate getWhen() {
        return when;
    }

    public String getSpecies() {
        return species;
    }

    public int getCount() {
        return count;
    }

    public String getNotes() {
        return notes;
    }
}
