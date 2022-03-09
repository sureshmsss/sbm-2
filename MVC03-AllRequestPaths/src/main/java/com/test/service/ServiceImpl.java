package com.test.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {
	@Override
	public String wishMsg() {
		LocalDateTime time = LocalDateTime.now();
		if (time.getHour() >= 12)
			return "G M " + LocalDateTime.now();
		else if (time.getHour() >= 14)
			return "G A " + LocalDateTime.now();
		else if (time.getHour() >= 20)
			return "G E " + LocalDateTime.now();
		else
			return "G N " + LocalDateTime.now();

	}
}
