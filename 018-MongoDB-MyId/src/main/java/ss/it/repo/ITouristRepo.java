package ss.it.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import ss.it.document.Tourist_No_Id;

public interface ITouristRepo extends MongoRepository<Tourist_No_Id, String> {

}