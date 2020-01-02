package cat;

import builder.CatBuilder;
import builder.Director;

public class Clowder {
    private Director director = new Director();
    private CatBuilder catBuilder = new CatBuilder();

    public void showCats() {
        getLionInfo();
        getTigerInfo();
        getLynxInfo();
        getFelisInfo();
    }

    public void getLionInfo() {
        director.createLion(catBuilder);
        Cat lion = catBuilder.getYourCat();
        System.out.println(lion.getType()
                + " "
                + lion.getSpecies());

    }

    public void getTigerInfo() {
        director.createTiger(catBuilder);
        Cat tiger = catBuilder.getYourCat();
        System.out.println(tiger.getType()
                + " "
                + tiger.getSubspecies());
    }

    public void getLynxInfo() {
        director.createLynx(catBuilder);
        Cat lynx = catBuilder.getYourCat();
        System.out.println(lynx.getType()
                + " "
                + lynx.getSubspecies());
    }

    public void getFelisInfo() {
        director.createFelis(catBuilder);
        Cat felis = catBuilder.getYourCat();
        System.out.println(felis.getType()
                + " "
                + felis.getBreed());
    }
}