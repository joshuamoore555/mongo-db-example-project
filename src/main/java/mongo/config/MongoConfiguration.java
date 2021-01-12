package mongo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "mongo.repository")
@Configuration
@RequiredArgsConstructor
class MongoConfiguration {

    @Value("${mongo.client}")
    private final String client;

    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create(client);
    }
}