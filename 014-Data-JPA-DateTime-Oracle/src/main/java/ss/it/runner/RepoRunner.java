package ss.it.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.PersonInfo;
import ss.it.service.IPersonService;

@Component
public class RepoRunner implements CommandLineRunner {
	@Autowired
	private IPersonService service;

	@Override
	public void run(String... args) throws Exception {
		PersonInfo info = new PersonInfo();
	//	info.setPid(1);//auto Increment in the table will takes care
		info.setPname("suresh");
		info.setPage(19f);
		info.setDob(LocalDate.of(1994, 06, 15));
		info.setDoj(LocalDateTime.of(2022, 4, 20, 10, 30));
		System.out.println(service.registerPerson(info));
		System.out.println("============");
		service.fetchAllPersons().forEach(System.out::println);
		;

	}

}
