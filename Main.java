import java.util.Arrays;

abstract class Person {
    protected String name;
    protected String nickname;
    protected int yearOfBorn;
    protected String expertin;
    protected Item[] items;

    public Person(String name, String nickname, int yearOfBorn, String expertin, Item[] items) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.expertin = expertin;
        this.items = items;
    }

    public void printBioData() {
        System.out.println("Name: " + name);
        System.out.println("Nickname: " + nickname);
        System.out.println("Year of Birth: " + yearOfBorn);
        System.out.println("Expertise: " + expertin);
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("  " + item.getName() + " - $" + item.getValue());
        }
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}

class Item {
    private String name;
    private double value;

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}

class Criminal extends Person {
    private static final int SUCCESS_PERCENTAGE = 70;

    public Criminal(String name, String nickname, int yearOfBorn, String expertin, Item[] items) {
        super(name, nickname, yearOfBorn, expertin, items);
    }

    @Override
    public void printBioData() {
        System.out.println("Criminal person:");
        super.printBioData();
    }
}

class Detective extends Person {
    private static final int SUCCESS_PERCENTAGE = 85;

    public Detective(String name, String nickname, int yearOfBorn, String expertin, Item[] items) {
        super(name, nickname, yearOfBorn, expertin, items);
    }

    @Override
    public void printBioData() {
        System.out.println("Detective:");
        super.printBioData();
    }
}

class Building {
    protected String name;
    protected Item[] items;

    public Building(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }
}

class City {
    private Building[] buildings;

    public City() {
        buildings = new Building[]{
                new Building("Bank", new Item[]{
                        new Item("Letter opener", 1.5),
                        new Item("Stamp", 2.5)
                }),
                new Building("Mansion", new Item[]{
                        new Item("Pair of fancy shoes", 25),
                        new Item("Broken glass", 0.1)
                }),
                new Building("Post Office", new Item[]{
                        new Item("Letter to Jenny", 1.5),
                        new Item("Pencil", 2.0)
                }),
                new Building("Supermarket", new Item[]{
                        new Item("A loaf of bread", 2.5),
                        new Item("A bag of tea", 6.5)
                })
        };
    }

    public Building[] getBuildings() {
        return buildings;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create City
        City city = new City();
        Building[] buildings = city.getBuildings();

        // Print Building and Item information
        for (Building building : buildings) {
            System.out.println("Building: " + building.getName());
            for (Item item : building.getItems()) {
                System.out.println("  " + item.getName() + " - $" + item.getValue());
            }
        }
    }
}


