package ss.it.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;

@Component
public class RepoRunner implements CommandLineRunner {
	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		// create a storedprocedurequery representing given pl/sql procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_MOVIE_BY_RATING_RANGE", Movie.class);

		// register parameters of pl/sql procedure with java types
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Movie.class, ParameterMode.REF_CURSOR);

		// set values to in params
		query.setParameter(1, "4.3");
		query.setParameter(2, "4.4");

		// execute storedprocedure
		List<Movie> list = query.getResultList();
		list.forEach(System.out::println);

	}

}
