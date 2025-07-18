package demo.mappers;

import demo.Entities.CountryGDP;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryGDPMapper {

    List<CountryGDP> getCountriesWithMaxGDPPerCapita();
}
