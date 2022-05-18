package ss.it.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component("bdReader")
public class BookDetailsReader implements ItemReader<String> {

	String books[] = new String[] { "AA", "BB", "CC", "DD", "DD", "EE", "FF" };// source
	int count = 0;

	public BookDetailsReader() {
		System.out.println("BookDetailsReader.BookDetailsReader()");
	}

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("BookDetailsReader.read()");
		if (count < books.length)
			return books[count++];
		else
			return null;
	}
}
