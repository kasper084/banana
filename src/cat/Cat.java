package cat;

public class Cat {
    private final Type type;
    private final Species species;
    private final String subspecies;
    private final String breed;

    public Cat(Type type, Species species, String subspecies, String breed) {
        this.type = type;
        this.species = species;
        this.subspecies = subspecies;
        this.breed = breed;
    }

    public Type getType() {
        return type;
    }

    public Species getSpecies() {
        return species;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public String getBreed() {
        return breed;
    }
}