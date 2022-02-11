package ss.it.runner;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.document.Tourist_No_Id;
import ss.it.service.ITouristService;

@Component
public class NoSQLRunner implements CommandLineRunner {
	@Autowired
	private ITouristService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			String id = UUID.randomUUID().toString();
			Tourist_No_Id tourist = new Tourist_No_Id();
			tourist.setId(id);
			tourist.setAdd("hyd");
			tourist.setName("suresh");
			tourist.setMobNo(901254684l);
			tourist.setTime(LocalDateTime.now());
			System.out.println(service.registerTourist(tourist));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
