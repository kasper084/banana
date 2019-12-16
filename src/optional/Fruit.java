package optional;

public class Fruit {
    private Integer id;
    private String name;
    private String color;

    public Fruit(Integer id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return " id: "
                + getId()
                + "| name: "
                + getName()
                + "| color: "
                + getColor();
    }
}