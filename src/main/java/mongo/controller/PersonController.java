package mongo.controller;

import lombok.RequiredArgsConstructor;
import mongo.documents.Person;
import mongo.repository.PersonRepository;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping("/people")
    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    @GetMapping("/person/{id}")
    public Optional<Person> getPersonById(@PathVariable final ObjectId id) {
        return personRepository.findById(id);
    }
}
