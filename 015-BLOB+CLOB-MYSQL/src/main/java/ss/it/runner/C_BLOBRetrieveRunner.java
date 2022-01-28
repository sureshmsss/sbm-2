package ss.it.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.PersonInfo;
import ss.it.service.IPersonInfoService;

@Component
public class C_BLOBRetrieveRunner implements CommandLineRunner {
	@Autowired
	private IPersonInfoService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			PersonInfo info = service.fetchAllPersons(4);
			if (info != null) {
				System.out.println(info.getPid() + "=>" + info.getPname() + "=>" + info.getDob());
				byte[] photoContent = info.getPhoto();
				OutputStream os = new FileOutputStream("deepika.jfif");
				os.write(photoContent);
				os.flush();
				os.close();

				System.out.println("photo retrieved from db table");
				char[] resumeContent = info.getResume();
				Writer writer = new FileWriter("myResume.txt");
				writer.write(resumeContent);
				writer.flush();
				writer.close();
				System.out.println("resume retrieved");
			} // if
			else {
				System.out.println("record not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
