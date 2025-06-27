package agrotech.fermerasistan.mapstruct;

import agrotech.fermerasistan.dto.PersonRequest;
import agrotech.fermerasistan.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapStruct {
    Person map(PersonRequest personRequest);
}