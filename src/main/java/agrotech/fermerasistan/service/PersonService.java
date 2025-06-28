package agrotech.fermerasistan.service;

import agrotech.fermerasistan.dto.PersonRequest;
import agrotech.fermerasistan.model.Person;
import jakarta.validation.Valid;

public interface PersonService {
    void createPerson(@Valid PersonRequest personRequest);

    Person getByFin(String fin);
}
