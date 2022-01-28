package ss.it.service;

import java.util.List;

import ss.it.entity.PersonInfo;

public interface IPersonInfoService {
	
	
	public String registerPerson(PersonInfo info);
	public PersonInfo fetchAllPersons(int pid);
}
