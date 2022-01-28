package ss.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ss.it.model.Tourist;
import ss.it.service.ITPService;
@Controller
public class TPController {
	@Autowired
	private ITPService service;

	public List<Tourist> getTourists_by_location(String location) throws Exception {

		List<Tourist> list = service.getPlaces(location);
		return list;

	}

}
