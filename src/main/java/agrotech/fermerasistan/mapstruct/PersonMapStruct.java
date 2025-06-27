package agrotech.fermerasistan.mapstruct;

import agrotech.fermerasistan.dto.PersonRequest;
import agrotech.fermerasistan.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PersonMapStruct {
    public abstract Person map(PersonRequest personRequest);
}
