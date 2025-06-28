package agrotech.fermerasistan.controller;

import agrotech.fermerasistan.dto.PersonRequest;
import agrotech.fermerasistan.model.Person;
import agrotech.fermerasistan.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public ResponseEntity<String> createPerson(@Valid @RequestBody PersonRequest personRequest) {
        personService.createPerson(personRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/fin/{fin}")
    public Person getByFin(@PathVariable String fin) {
        return personService.getByFin(fin);
    }
}
