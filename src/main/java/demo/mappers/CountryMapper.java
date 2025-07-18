package demo.mappers;

import demo.Entities.Country;
import demo.Entities.Language;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {

    List<Country> findAllCountries();

    Country findCountryById(int countryId);


}