package mongo.repository;

import mongo.documents.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PersonRepository extends MongoRepository<Person, ObjectId> {

    Optional<Person> findByName(String name);

}
