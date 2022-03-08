package ss.it.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {

	@Override
	public String createMessage() {
		LocalDateTime time = LocalDateTime.now();
		if (time.getHour() >= 12)
			return "Good Morning";
		else if (time.getHour() >= 16)
			return "Good afterNoon";
		else if (time.getHour() >= 16)
			return "Good Evening";
		else
			return "Good Night";
	}
	@Override
	public String server() {
		LocalDateTime time = LocalDateTime.now();
		if (time.getHour() >= 12)
			return "very good server";
		else if (time.getHour() >= 16)
			return "Good Server";
		else if (time.getHour() >= 16)
			return "Ok server";
		else
			return "Very Good Server";
	}

}
