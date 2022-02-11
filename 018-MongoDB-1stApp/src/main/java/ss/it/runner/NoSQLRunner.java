package ss.it.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.document.Tourist;
import ss.it.service.ITouristService;

@Component
public class NoSQLRunner implements CommandLineRunner {
	@Autowired
	private ITouristService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			/*			service.fetchAllTourists().forEach(e -> System.out.println(e));
						Tourist t = new Tourist();
						t.setName("suresh");
						t.setAdd("hyd");
						t.setBudget(5000f);
						t.setMobNo(9564352152L);
						Tourist t1 = new Tourist(null, "maheshuni", "napal", 452654f, 789788978l,
								LocalDateTime.of(2022, 10, 20, 11, 23, 12));
						List<Tourist> list = List.of(t, t1);
						System.out.println(service.saveGroup(list));
			
			service.fetchAll(false, "name").forEach(System.out::println);
			
			Optional<Tourist> opt = service.findById("620394dff612ef39c9748f23");
			if (opt.isPresent()) {
				System.out.println("doc is " + opt);
			} else {
				System.out.println("no doc is " + opt);
			}
			
			System.out.println(service.modifyTouristById("620394dff612ef39c9748f23", "hyd"));*/

			System.out.println(service.deleteOnId("620394dff612ef39c9748f23"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
