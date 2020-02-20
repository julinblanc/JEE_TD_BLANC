package fr.iut;

public class Room {

    private String name;
    private int occupation;
    private int capacity;

    public Room(String name, int occup, int cp) {
        this.name = name;
        occupation = occup;
        cp = capacity;
    }

    public String getName() {
        return name;
    }

    public int getOccupation() {
        return occupation;
    }

    public int getCapacity() {
        return capacity;
    }
}
