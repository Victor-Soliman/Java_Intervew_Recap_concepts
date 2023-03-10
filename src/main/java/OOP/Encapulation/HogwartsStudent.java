package OOP.Encapulation;

public class HogwartsStudent {
    private String name;
    private HogwartsHouse house;

    public HogwartsStudent(String name, int age) {
        this.name = name;
        this.house = HogwartsHouse.values()[Math.abs(name.hashCode()) % 4];
    }

    public String getName() {
        return name;
    }

    public HogwartsHouse getHouse() {
        return house;
    }
}
