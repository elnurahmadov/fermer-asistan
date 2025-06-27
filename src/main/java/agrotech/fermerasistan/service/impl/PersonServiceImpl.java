package agrotech.fermerasistan.service.impl;

import agrotech.fermerasistan.dto.PersonRequest;
import agrotech.fermerasistan.mapper.PersonMapper;
import agrotech.fermerasistan.mapstruct.PersonMapStruct;
import agrotech.fermerasistan.model.Person;
import agrotech.fermerasistan.service.PersonService;
import org.springframework.stereotype.Service;

@Service
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
}
