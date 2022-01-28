package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import ss.it.entity.Movie;
import ss.it.repository.I_Movie_Repo;

@Service
public class MovieServiceImpl implements IMovieService {

	@Autowired
	private I_Movie_Repo repo;

	@Override
	public String removeAllByBatch(List<Integer> ids) {

		List<Movie> list = repo.findAllById(ids);
		long count = list.size();
		repo.deleteAllByIdInBatch(ids);

		return count + "are deleted";

	}

	@Override
	public String fetchAllByIds(List<Integer> ids) {
		// List<Movie> list = repo.findAllById(ids);
		Iterable<Movie> it = repo.findAllById(ids);

		return it.toString();
	}

	@Override
	public List<Movie> serachMovieByMovie(Movie movie, boolean asc, String... props) {
		Example ex = Example.of(movie);
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, props);
		List<Movie> list = repo.findAll(ex, sort);
		return list;
	}

	@Override
	public Movie searchById(Integer id) {
		Movie m = repo.getById(id);
		return m;
	}
}
