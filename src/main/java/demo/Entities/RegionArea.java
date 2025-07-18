package demo.Entities;

import java.math.BigDecimal;

public class RegionArea {
    private String regionName;
    private BigDecimal regionArea;

    public RegionArea() {
    }

    public RegionArea(String regionName, BigDecimal regionArea) {
        this.regionName = regionName;
        this.regionArea = regionArea;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public BigDecimal getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(BigDecimal regionArea) {
        this.regionArea = regionArea;
    }
}