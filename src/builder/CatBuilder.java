package builder;

import cat.Cat;
import cat.Species;
import cat.Type;

public class CatBuilder implements Builder {
    private Type type;
    private Species species;
    private String subspecies;
    private String breed;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }


    public Cat getYourCat() {
        return new Cat(type, species, subspecies, breed);
    }
}