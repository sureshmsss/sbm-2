package ss.it.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import ss.it.document.Tourist;

public interface ITouristRepo extends MongoRepository<Tourist, String> {
//Entity operations
//	@Query(fields= "{}",value="{add:?0}")
	@Query(value = "{add:?0}")
	public List<Tourist> getAllTourist(String place);

	@Query(value = "{add:?0,budget:{$lte:?1}}")
	public List<Tourist> getTouristByBudget(String add, Float budget);

	@Query(value = "{budget:{$gte:?0},budget:{$lte:?1}}")
	public List<Tourist> getTouristBetWeenBudget(Float budget1, Float budget2);

	@Query(value = "{$or:[{add:?0},{add:?1}]}")
	public List<Tourist> getTouristByPlaces(String place1, String place2);

	// projections
	@Query(fields = "{name:1,mobNo:1}", value = "{add:?0}")
	public List<Tourist> getTouristNameMobBY(String place);

	@Query(fields = "{name:1,mobNo:1}", value = "{add:{$in:[?0,?1]}}")
	public List<Tourist> getTouristByChoicePlace(String place1, String place2);

	// regular expressions
	@Query(value = "{name:{$regex:?0}}")
	public List<Tourist> getTouristByRegEx(String place);

	// working with count
	@Query(value = "{name:?0}", count = true)
	public Integer getAllTouristByName(String name);

	// working with sorting 1 for ASC and -1 for DESC
	@Query(value = "{}", sort = "{name:1}")
	public List<Tourist> getAllTouristBySortASC();

	// working with delete
	@Query(value = "{time:null}", delete = true)
	public Integer deleteByTime();
	// working with exists
	@Query(value = "{time:false}", exists = true)
	public Boolean isTouristWithTime();

}