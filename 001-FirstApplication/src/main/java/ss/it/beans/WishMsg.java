package ss.it.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMsg {

	// HAS-A relation
	@Autowired
	private Calendar calender;

	// business method
	public String getMsg(String user) {
		int hour = calender.get(Calendar.HOUR);
		if (hour < 12)
			return "g m " + user;
		else if (hour < 16)
			return "g a " + user;
		else if (hour < 20)
			return "g e " + user;
		else
			return "g n " + user;
	}
}
