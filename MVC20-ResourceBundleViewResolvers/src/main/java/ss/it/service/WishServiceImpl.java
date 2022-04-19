package ss.it.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class WishServiceImpl implements IWishService{
	public String wish() {
		LocalDateTime date=LocalDateTime.now();
		if(date.getHour()<12)
			return "Good Morning";
		else if(date.getHour()<16)
			return "Good Afternoon";
		else if(date.getHour()<20)
			return "Good Evening";
		else 
			return "Good Nyyyyyyytttttttt";
	}

}
