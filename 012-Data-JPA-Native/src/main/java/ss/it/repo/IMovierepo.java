package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import ss.it.entity.Movie;

@Transactional
public interface IMovierepo extends JpaRepository<Movie, Integer> {

	@Query("update Movie set rating=:newRating where name=:name")
	@Modifying
	public int modifyRatingByName(String newRating, String name);

	@Query("delete from Movie where name=:name")
	@Modifying
	public int deleteMovieByName(String name);

	@Query(value = "insert into Movie values(hibernate_sequence.nextVal,?,?,?)", nativeQuery = true)
	@Modifying
	public int registerMovie(String name, String year, String rating);

	@Query(value="create table temp03(col1 varchar2(20))",nativeQuery=true)
	@Modifying
	public int createTempTable();
	
	
	@Query(value="drop table temp03",nativeQuery=true)
	@Modifying
	public int deleteTempTable();
	

}
