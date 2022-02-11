package ss.it.runner;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.aggregation.ConvertOperators.ToInt;
import org.springframework.stereotype.Component;

import ss.it.document.Tourist_No_Id;
import ss.it.repo.ITouristRepo;

@Component
public class NoSQLRunner implements CommandLineRunner {
	@Autowired
	private ITouristRepo repo;

	@Override
	public void run(String... args) throws Exception {
		int count = 0;
		try {
			for (int i = 1; i <= 100; i++) {

				ZoneId zid = ZoneId.systemDefault();
				long no = LocalDateTime.now().atZone(zid).toEpochSecond();
				Thread.sleep(10);
				Long id1 = System.currentTimeMillis() + no;
				Long id2 = (long) repo.hashCode() + id1;
				Long id3 = (long) this.hashCode() + id2;

				Long myId = id1 + id2 + id3 * 3 / 2;
				Tourist_No_Id tourist = new Tourist_No_Id();
				tourist.setId(id3 + tourist.hashCode());
				tourist.setAdd("hyd");
				tourist.setName("suresh");
				tourist.setMobNo(901254684l);
				tourist.setTime(LocalDateTime.now());

				repo.save(tourist);
				System.out.println("id : " + tourist.getId() + "and customers " + count++);

			}
			System.out.println(count + " are saved ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
