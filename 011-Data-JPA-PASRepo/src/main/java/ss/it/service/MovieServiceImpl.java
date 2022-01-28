package ss.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	public Iterable<Movie> displayMovieinOrder(boolean asc, String... properties) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public Page<Movie> generateReport(int pageNo, int pageSize, boolean asc, String... props) {

		// create pageable object
		Pageable pgbl = PageRequest.of(pageNo, pageSize, Sort.by(asc ? Direction.ASC : Direction.DESC, props));
		Page<Movie> page=repo.findAll(pgbl);
		return page;
	}

}
