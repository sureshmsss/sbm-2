package ss.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ss.it.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	//@Query("from Movie where rating=:rating")
	@Query("from Movie where rating=?1")
	public List<Movie> searchMoviesOfRating(String rating);
	//@Query("from Movie where id>=?1 and id<=?2")(or)
	@Query("from Movie where id>=:min and id<=:max")
	public List<Movie> searchMoviesbetweenRating(Integer min,Integer max);
	
	@Query("from Movie where name in(:name1,:name2,:name3,:name4) order by name asc")
	public List<Movie> searchMoviesByNames(String name1,String name2,String name3,String name4);
	@Query("from Movie where name in(?1,?2,?3,?4) order by name asc")
	public List<Movie> searchMoviesByNames1(String name1,String name2,String name3,String name4);
//	@Query("select id, name from Movie where rating in(:y1)")
//	public List<Object[]> fetchMovieDetailsByRatingsAndYear(float rat);
	
	@Query("select name from Movie where year>:start and year<=:end order by name asc")
	public List<String> fetchMoviesByYearRange(String start,String end);
	@Query("from Movie where name=:name")
	public Movie fetchDataByMovieName(String name);
	@Query("select id,name,rating from Movie where name=:name")
	public Object fetchDetailsByMovieName(String name);
	@Query("select year from Movie where name=:name")
	public String fetchYearByName(String name); 
	@Query("select max(rating),min(rating),avg(rating) from Movie")
	public Object fetchAggregateDataOnMovies();
	@Query("from Movie where rating =(select max(rating) from Movie)")
	public List<Movie> fetchMaxRatingMovies();
	@Query("from Movie where id=(select max(id) from Movie)")
	public List<Movie> fetchMaxId();
}