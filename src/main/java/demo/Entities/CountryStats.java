package demo.Entities;

import java.math.BigDecimal;

public class CountryStats {
    private Integer countryId;
    private int year;
    private Integer population;
    private BigDecimal gdp;

    public CountryStats() {
    }

    public CountryStats(Integer countryId, int year, Integer population, BigDecimal gdp) {
        this.countryId = countryId;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }
}