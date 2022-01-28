package ss.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	public List<Movie> findByName(String name);

	public List<Movie> findByNameStartsWith(String initChar);

	public List<Movie> findByNameEndsWith(String lostChar);

	public List<Movie> findByNameContains(String letters);

	public Iterable<Movie> findByNameEqualsIgnoreCase(String chars);

	public Iterable<Movie> findByNameContainsIgnoreCase(String chars);

	public Iterable<Movie> findByNameLike(String chars);

//=========================================================
	public Iterable<Movie> findByIdGreaterThan(int mid);

	public Iterable<Movie> findByIdGreaterThanAndRatingLessThan(int mid, String rating);

	public Iterable<Movie> findByIdLessThanAndRatingGreaterThan(int startMid, String rating);

	public Iterable<Movie> findByNameStartingWithOrIdBetween(String chars, int startId, int endId);
	public Iterable<Movie> findByNameStartingWithAndIdBetween(String chars, int startId, int endId);

//select mid,mname,year,ratings from Movie where year in (? , ?) or (upper(mname) like upper(?) escape ?) and (ratings between ? and ?)
	public Iterable<Movie> findByYearInOrNameContainingIgnoreCaseAndRatingBetween(List<String> years, String chars,
			String startRatings, String endRatings);

//select mid,mname,year,ratings from Movie where (mname not like ? escape ?) and (year in (? , ?)) order by mname asc
	public Iterable<Movie> findByNameNotLikeAndIdInOrderByNameAsc(String letters, List<Integer> id);

}