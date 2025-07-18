package demo.controllers;

import demo.Entities.Country;
import demo.Entities.Language;
import demo.mappers.LanguageMapper;
import demo.mappers.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    private final CountryMapper countryMapper;
    private final LanguageMapper languageMapper;

    @Autowired
    public CountryController(CountryMapper countryMapper, LanguageMapper languageMapper) {
        this.countryMapper = countryMapper;
        this.languageMapper = languageMapper;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryMapper.findAllCountries();
    }

//    @GetMapping("/{id}")
//    public Country getCountryById(@PathVariable("id") int countryId) {
//        return countryMapper.findCountryById(countryId);
//    }

    @GetMapping("/{ctId}")
    public List<Language> getLanguage(@PathVariable("ctId") int countryId) {
        System.out.println(languageMapper.findLanguageByCountryId(countryId));
        return languageMapper.findLanguageByCountryId(countryId);
    }

}