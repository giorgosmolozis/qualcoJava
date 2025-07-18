package demo.Entities;

public class Region {
    private int regionId;
    private String name;
    private int continentId;

    public Region() {
    }

    public Region(int regionId, String name, int continentId) {
        this.regionId = regionId;
        this.name = name;
        this.continentId = continentId;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContinentId() {
        return continentId;
    }

    public void setContinentId(int continentId) {
        this.continentId = continentId;
    }
}