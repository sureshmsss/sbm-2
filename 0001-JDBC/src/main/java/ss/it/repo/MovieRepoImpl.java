package ss.it.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;

//@Component
public class MovieRepoImpl implements IMovieRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String getMoviesById = "select id,name,rating,time from movie where id=?";
	private static final String GET_MOVIES_BY_RATING="SELECT ID,NAME,TIME,RATING FROM MOVIE WHERE RATING>=? AND RATING<=?";

	@Override
	public int getRowCount() {
		String sql = "select count(*) from movie";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public String getMovieNameById(Integer id) {
		String sql = "select name from Movie where id=" + id;
		// Map<String,Object> name=jdbcTemplate.queryForMap(sql, id);
		String name = jdbcTemplate.queryForObject(sql, String.class, id);
		return name.toString();
	}

	@Override
	public List getAll() {
		String sql = "select * from movie";
		List list = jdbcTemplate.queryForList(sql);
		return list;
	}

	@Override
	public int updateRating(Integer id, String rating) {
		String sql = "update movie set rating=? where id=?";
		int status = jdbcTemplate.update(sql, id, rating);

		return status;
	}

	@Override
	public int deleteMovie(Integer id) {
		System.out.println("===================");
		String sql = "delete from Movie where id=?";
		int status = jdbcTemplate.update(sql, id);
		return status;
	}

	@Override
	public int getMovieByRating(String rating, String name) {
		String sql = "delete from Movie where rating=? AND name=?";
		int list = jdbcTemplate.update(sql, rating, name);
		return list;
	}

	@Override
	public int insertMovie(Integer id, String name, String rating, String year) {
		String sql = "insert into movie values(?,?,?,?)";
		int status = jdbcTemplate.update(sql, id, name, rating, year);
		// TODO Auto-generated method stub
		return 0;
	}
	/*
		@Override
		public Movie getMovieDetails(Integer id) {
	
			Movie m = jdbcTemplate.queryForObject(getMoviesBy, new MovieMapper(), id);
			return m;
		}
	
		private class MovieMapper implements RowMapper<Movie> {
			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				// copy the rs to movie obje
				Movie m = new Movie();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setRating(rs.getString(3));
				m.setYear(rs.getString(4));
	
				return m;
			}
		}*/

	@Override
	public Movie getMovieDetails(Integer id) {
		Movie e = jdbcTemplate.queryForObject(getMoviesById, (rs, rowNum) -> {
			// copy the rs to movie object
			Movie m = new Movie();
			m.setId(rs.getInt(1));
			m.setName(rs.getString(2));
			m.setRating(rs.getString(3));
			m.setYear(rs.getString(4));

			return m;
		}, id);
		return e;
	}
	@Override
	public List<Movie> getMoviesByRatings(String rating1,String rating2){
		System.out.println("=====ResultSetExtractor======");

		List<Movie> list=jdbcTemplate.query(GET_MOVIES_BY_RATING, rs->{
			//copy the list of Movie records from rs to list object
			List<Movie> listMovies=new ArrayList<Movie>();
			while(rs.next()) {
				//create a Movie object
				Movie m=new Movie();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setRating(rs.getString(3));
				m.setYear(rs.getString(4));
				listMovies.add(m);
			}
			return listMovies;
		}, rating1,rating2);
		
		
		return list;
	}

	@Override
	public int insertMovieObj(Movie m) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
