package com.example.vocal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class VocaloidRestController {
	
	@Autowired
	VocaloidService vocaloidService;
	
	//GET	
	@GetMapping("/all")
	public Iterable<Vocaloid> showAllVocal() {
		return vocaloidService.queryVocals();
	}
	
	//POST
	@PostMapping(path="/add", consumes="application/json")
	public boolean insertVocal(@RequestBody Vocaloid vocal) {
		vocaloidService.queryAddVocal(vocal);
		Boolean add = vocaloidService.queryAddVocal(vocal);
		if(add) {
			return true;
		} else {
			return false;
		}
	}
	
}
