package ss.it.service;

import java.util.List;

import ss.it.entity.PersonInfo;

public interface IPersonService {

	public String registerPerson(PersonInfo info);

	public List<PersonInfo> fetchAllPersons();

}
