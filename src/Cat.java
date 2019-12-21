
public class Cat {
    private NoiseInterface meow = noise -> System.out.println(getName() + " says " + noise);
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void sayMeow() {
        meow.makeSomeNoise("Meow!");
    }

    public String getName() {
        return name;
    }
}