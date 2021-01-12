package mongo.documents;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "person")
public class Person {

    @MongoId
    @Field(name = "_id")
    private ObjectId id;

    @Field(name = "name")
    private String name;

}