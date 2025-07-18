package demo.mappers;

import demo.Entities.Language;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LanguageMapper {

    List<Language> findAllLanguages();

    Language findLanguageById(@Param("languageId") int languageId);

    List<Language> findLanguageByCountryId(@Param("countryId") int countryId);
}
