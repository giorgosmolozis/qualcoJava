package demo.Entities;

public class CountryLanguage {
    private Integer countryId;
    private Integer languageId;
    private Boolean official;

    public CountryLanguage() {
    }

    public CountryLanguage(Integer countryId, Integer languageId, Boolean official) {
        this.countryId = countryId;
        this.languageId = languageId;
        this.official = official;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }
}