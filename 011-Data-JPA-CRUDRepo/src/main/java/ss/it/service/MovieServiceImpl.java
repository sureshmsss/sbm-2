package ss.it.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.entity.Movie;
import ss.it.repository.I_Movie_Repo;

@Service
public class MovieServiceImpl implements IMovieService {

	@Autowired
	private I_Movie_Repo repo;

	@Override
	public String regMovie(Movie movie) {
		System.out.println("regMovie() " + this.getClass());
		Movie movie1 = repo.save(movie);
		return "movie is registered with :" + movie.getId();
	}

	@Override
	public long getMoviesCount() {
		return repo.count();
	}

	@Override
	public boolean searchById(Integer id) {
		return repo.existsById(id);
	}

	@Override
	public Iterable<Movie> fetchAllMovies() {
		return repo.findAll();
	}

	@Override
	public Iterable<Movie> fetchAllMoviesByIds(List<Integer> id) {
		return repo.findAllById(id);
	}

	/*
	 * // findById() method version-1 public Optional<Movie> getById1(Integer id) {
	 * return repo.findById(id); }
	 * 
	 * // findById() method version-2 public Movie getById2(Integer id) { //
	 * version-2 Optional<Movie> opt = repo.findById(id); if (opt.isPresent())
	 * return opt.get(); else throw new
	 * IllegalArgumentException("Record Not Found"); }
	 * 
	 * // findById() method version-3 public Movie getById3(Integer id) { return
	 * repo.findById(id).orElseThrow(() -> new
	 * IllegalArgumentException("record not found")); }
	 */
	@Override
	//// findById() method version-4
	public Movie getById(Integer id) {
		return repo.findById(id).orElse(new Movie());
	}

	@Override
	public Optional<Movie> fetchById(Integer id) {
		Optional<Movie> opt = repo.findById(id);
		return opt.isEmpty() ? Optional.empty() : opt;
	}

	@Override
	public String groupReg(List<Movie> moviesList) {
		Iterable<Movie> savedMovies = repo.saveAll(moviesList);
		List<Integer> ids = new ArrayList();
		List<String> names = new ArrayList();
		savedMovies.forEach(k -> ids.add(k.getId()));
		savedMovies.forEach(l -> names.add(l.getName()));
		if (savedMovies != null && ((List<Movie>) savedMovies).size() > 0) {
			savedMovies.forEach(m -> {
				((List<Integer>) ids).add(m.getId());
			});
			savedMovies.forEach(n -> names.add(n.getName()));

		} // if
			// return ids.toString() + " movies are saved with names " + names.toString();
		return ids.toString() + "=" + names.toString();
	}

	@Override
	public String partialupdateMovie(Integer mid, String year, String rating) {
		Optional<Movie> opt = repo.findById(mid);
		if (opt.isPresent()) {
			System.out.println(opt.toString());
			Movie movie = opt.get();
			movie.setYear(year);
			movie.setRating(rating);
			repo.save(movie);
			return "movie is updted : " + mid;
		} else {
			return "movie is not found with id : " + mid;
		}
	}

	@Override
	public String fullUpdateMovie(Movie movie) {
		Optional<Movie> opt = repo.findById(movie.getId());
		if (opt.isPresent()) {
			repo.save(movie);
			return "movie is updated";
		} else {
			return "movie is not found to update";
		}
	}

	@Override
	public String UpdateMovie(Movie movie) {
		repo.save(movie);
		return "movie is updated";
	}

	@Override
	public String removeById(Integer mid) {
		Optional<Movie> opt = repo.findById(mid);
		if (opt.isPresent()) {
			repo.deleteById(mid);
			return "record is deleted with : " + mid;
		} else {
			return "record is not found with : " + mid;
		}
	}

	@Override
	public String removeAllMovies() {
		long count = repo.count();
		if (count != 0)
			repo.deleteAll();
		return "movies deleted";
	}

	@Override
	public String removeAllMoviesByIds(List<Integer> ids) {
		Iterable<Movie> it = repo.findAllById(ids);

		long count = ((List<Movie>) it).size();

		if (ids.size() != 0 && ids.size() == count) {
			repo.deleteAllById(ids);
			return count + "all records deleted";
		} else {
			return "no ids are found to delete";
		}
	}

	@Override
	public String removeAll() {
		List<Movie> list = (List<Movie>) repo.findAll();
		if (list.isEmpty()) {
			return "no movies avalilabel to delete";
		} else {
			long count = list.size();
			repo.deleteAll(list);
			return count + "movies are deleted";
		}
	}

}
