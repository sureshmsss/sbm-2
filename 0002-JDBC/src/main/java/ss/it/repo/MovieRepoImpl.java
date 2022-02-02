package ss.it.repo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;

@Component
public class MovieRepoImpl implements IMovieRepo {
	@Autowired
	private SimpleJdbcInsert sj;

	@Override
 	public int insert(Movie movie) {
 		//sset table name
 		sj.setTableName("movie");
 		//create MAP obj having col names and values
 		Map<String,Object> map=Map.of("id",movie.getId(),"name",movie.getName(),"time",movie.getYear(),"rating",movie.getRating());
 		int count=sj.execute(map);
 		return count;
 	}
}
