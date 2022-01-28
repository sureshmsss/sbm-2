package ss.it.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.PersonInfo;
import ss.it.service.IPersonInfoService;

@Component
public class C_BLOBUploadRunner implements CommandLineRunner {
	@Autowired
	private IPersonInfoService service;

	@Override
	public void run(String... args) throws Exception {
		String photo = "dp.jfif";
		String resume = "error.txt";

		// create byte[] representing photo file content
		InputStream is = new FileInputStream(photo);
		byte[] photoContent = new byte[is.available()];
		photoContent = is.readAllBytes();

		// create char[] representing resume content

		Reader reader = new FileReader(resume);
		File file = new File(resume);
		char[] resumecontent = new char[(int) file.length()];
		reader.read(resumecontent);

		// prepare entity object with data
		// PersonInfo info = new PersonInfo(-1, "suresh", LocalDateTime.of(1994, 06, 15,
		// 11, 23), true, photoContent,
		// resumecontent);
		PersonInfo info = new PersonInfo();
		// info.setPid(null);//generator is configured
		info.setPname("ss");
		info.setMarried(true);
		info.setDob(LocalDateTime.of(1994, 06, 15, 11, 23));
		info.setPhoto(photoContent);
		info.setResume(resumecontent);
		try {
			System.out.println(service.registerPerson(info));
			System.out.println("============");
			// service.fetchAllPersons().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
