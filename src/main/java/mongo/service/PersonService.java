package mongo.service;

import lombok.RequiredArgsConstructor;
import mongo.documents.Person;
import mongo.repository.PersonRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(final ObjectId id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person findByName(final String name) {
        return personRepository.findByName(name).orElse(null);
    }

}
