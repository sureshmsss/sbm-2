package ss.it.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ss.it.document.MyTourist;

public interface ITouristRepo extends MongoRepository<MyTourist, String> {
	public List<MyTourist> findByMobNo(long contact);

	public List<MyTourist> findANDDeleteByMobNo(long contact);

}