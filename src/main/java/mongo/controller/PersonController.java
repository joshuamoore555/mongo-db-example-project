package mongo.controller;

import lombok.RequiredArgsConstructor;
import mongo.documents.Person;
import mongo.service.PersonService;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getPeople() {
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/person/id/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable final ObjectId id) {
        return ResponseEntity.ok(personService.findById(id));
    }

    @GetMapping("/person/name/{name}")
    public ResponseEntity<Person> getPersonByName(@PathVariable final String name) {
        return ResponseEntity.ok(personService.findByName(name));
    }
}
