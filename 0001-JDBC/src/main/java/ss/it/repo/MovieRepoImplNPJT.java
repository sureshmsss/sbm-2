package ss.it.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;

@Component
public class MovieRepoImplNPJT implements IMovieRepo {
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	private static final String GET_MOVIENAME_BY_ID = "SELECT NAME FROM MOVIE WHERE ID=:id";
	private static final String GET_MOVIES_BY_REATINGS = "SELECT ID,NAME,TIME,rating FROM MOVIE WHERE RATING IN(:R1,:R2)";
	private static final String INSERT_MOVIE = "INSERT INTO MOVIE1(ID,NAME,YEAR,RATING) VALUES(:id,:name,:year,:rating) ";

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getMovieNameById(Integer id) {
		System.out.println("from NPJT");
		Map<String, Object> paramsMap = Map.of("id", id);
		String name = npjt.queryForObject(GET_MOVIENAME_BY_ID, paramsMap, String.class);
		return name;
	}

	@Override
	public int insertMovieObj(Movie m) {
		// create BeanSqlParametersource
		BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(m);
		int count = npjt.update(INSERT_MOVIE, source);

		return 0;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateRating(Integer id, String rating) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMovie(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMovieByRating(String rating, String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertMovie(Integer id, String name, String rating, String year) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Movie getMovieDetails(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMoviesByRatings(String rating1, String rating2) {
		// create a MapSqlparamsource
		MapSqlParameterSource source = new MapSqlParameterSource();

		source.addValue("R1", rating1);
		source.addValue("R2", rating2);
		List<Movie> list = npjt.query(GET_MOVIES_BY_REATINGS, source, rs -> {
			// create a list to copy movie records from rs
			List<Movie> listMs = new ArrayList();
			while (rs.next()) {
				Movie m = new Movie();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setYear(rs.getString(3));
				m.setRating(rs.getString(4));
				listMs.add(m);
			}
			return listMs;
		});
		return list;
	}

}
