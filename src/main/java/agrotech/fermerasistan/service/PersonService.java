package agrotech.fermerasistan.service;

import agrotech.fermerasistan.dto.PersonRequest;
import jakarta.validation.Valid;

public interface PersonService {
    void createPerson(@Valid PersonRequest personRequest);
}
