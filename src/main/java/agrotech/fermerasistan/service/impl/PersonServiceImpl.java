package agrotech.fermerasistan.service.impl;

import agrotech.fermerasistan.dto.PersonRequest;
import agrotech.fermerasistan.exception.NotFoundException;
import agrotech.fermerasistan.mapper.PersonMapper;
import agrotech.fermerasistan.mapstruct.PersonMapStruct;
import agrotech.fermerasistan.model.Person;
import agrotech.fermerasistan.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {
    private final PersonMapper personMapper;
    private final PersonMapStruct personMapStruct;

    public PersonServiceImpl(PersonMapper personMapper, PersonMapStruct personMapStruct) {
        this.personMapper = personMapper;
        this.personMapStruct = personMapStruct;
    }

    @Override
    public void createPerson(PersonRequest personRequest) {
        Person person = personMapStruct.map(personRequest);

        personMapper.insertPerson(person);
    }

    @Override
    public Person getByFin(String fin) {
        log.info("Looking for person with FIN: {}", fin);
        Person person = personMapper.getPersonByFin(fin);
        if (person == null) {
            log.warn("Person not found with FIN: {}", fin);
            throw new NotFoundException("Person with FIN " + fin + " not found");
        }
        log.info("Person found: {}", person);
        return person;
    }
}
