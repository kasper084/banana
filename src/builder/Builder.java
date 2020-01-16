package builder;

import enums.Species;
import enums.Type;

public interface Builder {
    void setType(Type type);

    void setSpecies(Species species);

    void setSubspecies(String subspecies);

    void setBreed(String breed);
}