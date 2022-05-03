package ss.it.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {

	@Scheduled(fixedDelayString = "3000")
	public void generateSalesReport() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sales report on :: " + new Date());
		}
	}
}
