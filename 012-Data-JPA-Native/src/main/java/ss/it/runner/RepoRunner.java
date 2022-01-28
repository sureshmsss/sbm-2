package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.repo.IMovierepo;

@Component
public class RepoRunner implements CommandLineRunner {
	@Autowired
	private IMovierepo repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * System.out.println("updating : " + repo.modifyRatingByName("4.9", "rrr"));
		 * System.out.println("deleting : " + repo.deleteMovieByName("83"));
		 */ System.out.println("inserting : " + repo.registerMovie("BN", "2022", "4.6"));

		System.out.println("table creation is : "+repo.createTempTable());
		System.out.println("table deletion is : "+repo.deleteTempTable());
	}

}
