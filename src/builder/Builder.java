package builder;

import cat.Species;
import cat.Type;

public interface Builder {
    void setType(Type type);

    void setSpecies(Species species);

    void setSubspecies(String subspecies);

    void setBreed(String breed);
}