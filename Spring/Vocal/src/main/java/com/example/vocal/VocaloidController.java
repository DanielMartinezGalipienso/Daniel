package com.example.vocal;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vocaloid")
public class VocaloidController {
	
	@Autowired
	VocaloidService vocaloidService;
	
	@RequestMapping("/show")
	public String showAllVocals(Model modelContainer) {
		
		//Send the List of Vocaloid by the use of the method queryVocals from the VocaloidService
		//With the label of vocalsFromController
		modelContainer.addAttribute("vocalsFromController", vocaloidService.queryVocals());
		
		return "showvocaloid";
	}
	
	@RequestMapping("/new")
	public String addNewVocal(Vocaloid vocaloidToAdd, Model modelContainer) {
		
		//
		//To-Do
		//Required validations, security...
		return "newvocaloid";
	}
	@RequestMapping("/add")
	public String insertVocal(Vocaloid vocaloidToInsert, Model modelContainer) {
		//Add the Vocaloid to the List of Vocaloid
		vocaloidService.queryAddVocal(vocaloidToInsert);
		
		//Add the information of the Object created into
		//for a show information of this in the page of successfully created.
		modelContainer.addAttribute("vocalCreated", vocaloidToInsert);
		//Add the time of the creation in server how an additional information.
		// - Required import for Date
		modelContainer.addAttribute("serverTime", new Date());
		
		return "createdvocaloid";
	}
	
	@RequestMapping("/delete")
	public String deleteVocal() {
		
		return "supressvocaloid";
	}
	
	@RequestMapping("/deleteOneVocal")
	public String deletedVocal(Vocaloid vocaloidToDelete, Model modelContainer) {
		
		String nameOfVocaloidToDelete = vocaloidToDelete.getNameVocaloid();
		int deletedVocalCode = vocaloidService.deleteVocal(nameOfVocaloidToDelete);
		if(deletedVocalCode < 0) {
			//Something's wrong
			modelContainer.addAttribute("vocalDeleted", vocaloidToDelete);
			return "deletederrorvocaloid";
			
		} else {
		modelContainer.addAttribute("vocalDeleted", deletedVocalCode);
		modelContainer.addAttribute("serverTime", new Date());
		return "deletedvocaloid";
		
		}
	}
	
	@RequestMapping("/deleteAllVocals")
	public String deletedAllVocals(Model modelContainer) {
		int deletedVocalCode = vocaloidService.deleteAllVocalsWithCounter();
		if(deletedVocalCode < 0 ) {
			
			return "deletederrorvocaloid";
		} else {
			modelContainer.addAttribute("serverTime", new Date());
			modelContainer.addAttribute("vocalDeleted", deletedVocalCode);
		return "deletedvocaloid";
		}
	}

}
