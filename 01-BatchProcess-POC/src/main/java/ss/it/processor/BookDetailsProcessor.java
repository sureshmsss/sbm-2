package ss.it.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component("bdProcessor")
public class BookDetailsProcessor implements ItemProcessor<String, String> {
	public BookDetailsProcessor() {
		System.out.println("BookDetailsProcessor.BookDetailsProcessor()");
	}

	@Override
	public String process(String item) throws Exception {
		System.out.println("BookDetailsProcessor.process()");
		String bookWithTitle = null;
		if (item.equalsIgnoreCase("aa"))
			bookWithTitle = item + "by a";
		else if (item.equalsIgnoreCase("bb"))
			bookWithTitle = item + "by b";
		else if (item.equalsIgnoreCase("cc"))
			bookWithTitle = item + "by c";
		else if (item.equalsIgnoreCase("dd"))
			bookWithTitle = item + "by d";
		else if (item.equalsIgnoreCase("ee"))
			bookWithTitle = item + "by e";
		else if (item.equalsIgnoreCase("ff"))
			bookWithTitle = item + "by f";
		return bookWithTitle;
	}
}
