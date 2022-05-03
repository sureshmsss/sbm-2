package ss.it.service;

import java.util.Arrays;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class OrderImpl implements OrderService {
	@Autowired
	private JavaMailSender sender;

	@Value("${spring.mail.username}")
	private String fromEmail;

	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception {

		// calcuate the bill amount
		double billAmt = 0.0;
		for (double p : prices)
			billAmt = billAmt + p;
		String msg = Arrays.toString(prices) + " are purchased with bill Amount " + billAmt;

		// send mail
		String status = sendMail(msg, toEmails);
		return msg + "======>" + status;
	}

	private String sendMail(String msg, String[] toEmails) throws MessagingException {
		// empty email message
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(fromEmail);
		helper.setCc(toEmails);
		helper.setSubject("open the pic");
		helper.setSentDate(new Date());
		helper.setText(msg);

		// place nit jpg or get the location
		helper.addAttachment("ss.png", new ClassPathResource("ss.png"));
		sender.send(message);
		return "mail sent";
	}
}
