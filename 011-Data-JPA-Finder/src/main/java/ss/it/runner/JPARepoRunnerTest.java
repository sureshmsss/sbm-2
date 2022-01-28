package ss.it.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.repository.IMovieRepo;

@Component
public class JPARepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * repo.findByName("rrr").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameStartsWith("A").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameEndsWith("R").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameContains("D").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameEqualsIgnoreCase("rrR").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameContainsIgnoreCase("a").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameLike("%a%").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameLike("___").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameLike("%R").forEach(System.out::println);
		 * System.out.println("=================");
		 * repo.findByNameLike("A%").forEach(System.out::println);
		 */

		System.out.println("===========================");
		repo.findByIdGreaterThan(150).forEach(System.out::println);
		System.out.println("===========================");
		repo.findByIdGreaterThanAndRatingLessThan(152, "4.3").forEach(System.out::println);
		System.out.println("===========================");
		repo.findByIdLessThanAndRatingGreaterThan(152, "4.3").forEach(System.out::println);
		System.out.println("===========================");
		repo.findByNameStartingWithOrIdBetween("A", 147, 156).forEach(System.out::println);
		System.out.println("===========================");
		repo.findByNameStartingWithAndIdBetween("A", 147, 156).forEach(System.out::println);
		System.out.println("===========================");
		repo.findByYearInOrNameContainingIgnoreCaseAndRatingBetween(List.of("2021-12","2022-01"), "a", "4.1", "4.5")
				.forEach(System.out::println);
		System.out.println("===========================");
		repo.findByNameNotLikeAndIdInOrderByNameAsc("rrr",List.of(147,148,149,150,151,152)).forEach(System.out::println);

	}

}
