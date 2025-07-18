package demo.Entities;


public class Continent {
    private int continentId;
    private String name;

    public Continent() {
    }

    public Continent(int continentId, String name) {
        this.continentId = continentId;
        this.name = name;
    }

    public int getContinentId() {
        return continentId;
    }

    public void setContinentId(int continentId) {
        this.continentId = continentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}