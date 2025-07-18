package demo.controllers;

import demo.Entities.CountryGDP;
import demo.mappers.CountryGDPMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country-gdp-stats")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryGDPStats {

    private final CountryGDPMapper countryGDPMapper;

    @Autowired
    public CountryGDPStats(CountryGDPMapper countryGDPMapper) {
        this.countryGDPMapper = countryGDPMapper;
    }

    @GetMapping
    public List<CountryGDP> getCountriesWithMaxGDPPerCapita() {
        return countryGDPMapper.getCountriesWithMaxGDPPerCapita();
    }

}