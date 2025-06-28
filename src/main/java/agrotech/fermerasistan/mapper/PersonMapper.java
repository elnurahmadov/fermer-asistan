package agrotech.fermerasistan.mapper;

import agrotech.fermerasistan.model.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    void insertPerson(Person person);

    Person getPersonByFin(String fin);
}
