package ss.it.service;

import java.util.List;

import ss.it.model.Tourist;

public interface ITPService {
	public List<Tourist> getPlaces(String location) throws Exception;

}
