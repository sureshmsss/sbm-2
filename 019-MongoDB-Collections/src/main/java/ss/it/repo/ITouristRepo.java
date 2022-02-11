package ss.it.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ss.it.document.MyCollection;

public interface ITouristRepo extends MongoRepository<MyCollection, String> {
//	public List<MyCollection> findByMobNo(long contact);

}