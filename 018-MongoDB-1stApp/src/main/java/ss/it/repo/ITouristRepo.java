package ss.it.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import ss.it.document.Tourist;

public interface ITouristRepo extends MongoRepository<Tourist, String> {

}