package builder;

import cat.Species;
import cat.Type;

public class Director {

    public void createLion(Builder builder) {
        builder.setType(Type.BIG_CAT);
        builder.setSpecies(Species.LION);
    }

    public void createTiger(Builder builder) {
        builder.setType(Type.BIG_CAT);
        builder.setSpecies(Species.TIGER);
        builder.setSubspecies("Siberian tiger");
    }

    public void createLynx(Builder builder) {
        builder.setType(Type.SMALL_CAT);
        builder.setSpecies(Species.LYNX);
        builder.setSubspecies("Eurasian lynx");
    }

    public void createFelis(Builder builder) {
        builder.setType(Type.SMALL_CAT);
        builder.setSpecies(Species.FELIS);
        builder.setSubspecies("Domestic cat");
        builder.setBreed("Maine Coon");
    }
}