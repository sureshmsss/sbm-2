package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.repo.ITouristRepo;

@Component
public class NoSQLRunner implements CommandLineRunner {
	@Autowired
	private ITouristRepo trepo;

	@Override
	public void run(String... args) throws Exception {
		try {
			// trepo.getAllTourist("hyd").forEach(System.out::println);
			// trepo.getTouristByBudget("hyd", 50000f).forEach(System.out::println);
			// trepo.getTouristBetWeenBudget(5000f, 50000f).forEach(System.out::println);
			// trepo.getTouristByPlaces("hyd", "usa").forEach(System.out::println);
			// trepo.getTouristNameMobBY("hyd").forEach(System.out::println);
			// trepo.getTouristByChoicePlace("usa", "hyd").forEach(System.out::println);
			/*System.out.println("=============starts with s==========================");
			trepo.getTouristByRegEx("^s").forEach(System.out::println);
			System.out.println("=================ends with h======================");
			trepo.getTouristByRegEx("h$").forEach(System.out::println);
			System.out.println("==============contains a=========================");
			trepo.getTouristByRegEx("a").forEach(System.out::println);*/

			// System.out.println("total tourists named with :
			// "+trepo.getAllTouristByName("suresh"));
			//trepo.getAllTouristBySortASC().forEach(System.out::println);
			//System.out.println(trepo.deleteByTime());
			System.out.println(trepo.isTouristWithTime());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
