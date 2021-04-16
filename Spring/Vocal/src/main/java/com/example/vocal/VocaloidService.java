package com.example.vocal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VocaloidService {
	
	static List<Vocaloid> vocals = new ArrayList<Vocaloid>();
	
	static {
		Vocaloid vocaloid1 = new Vocaloid("Kaito");
		Vocaloid vocaloid2 = new Vocaloid("Meiko");
		Vocaloid vocaloid3 = new Vocaloid("Miku");
		Vocaloid vocaloid4 = new Vocaloid("Rin");
		Vocaloid vocaloid5 = new Vocaloid("Len");
		Vocaloid vocaloid6 = new Vocaloid("Luka");
		vocals.add(vocaloid1);
		vocals.add(vocaloid2);
		vocals.add(vocaloid3);
		vocals.add(vocaloid4);
		vocals.add(vocaloid5);
		vocals.add(vocaloid6);
	}

	//Return the List of Vocaloid
	public List<Vocaloid> queryVocals() {
		
		return vocals;
	}
	
	//Add one Vocaloid to the List of Vocaloid
	public boolean queryAddVocal(Vocaloid vocaloidToAdd) {
		/* Recommendation from the IDE:
		   use a static way for access
		 * this.vocals.add(vocaloidToAdd);
		 * --> VocaloidService.vocals.add(vocaloidToAdd);
		 */
		
		//To-Do Add a verification for if the Vocaloid already Exist
		VocaloidService.vocals.add(vocaloidToAdd);
		
		return true;
	}
	
	public int deleteVocal(String nameOfVocal) {

		int countOfDeletes = 0;
		if(haveVocals() == false) {
			return -1;
		}
		int i = 0;
		List<Vocaloid> listOfVocals = VocaloidService.vocals;
		while(i < listOfVocals.size()) {
			if(listOfVocals.get(i).getNameVocaloid().equals(nameOfVocal)) {
				VocaloidService.vocals.remove(i);
				countOfDeletes += 1;
			}
			i++;
		}
		
		return countOfDeletes;
	}
	//To-Do -> Not implemented
	public int deleteSomeVocals(ArrayList<String> nameOfSameVocals) {
		int countOfDeletes = 0;
		if (haveVocals() == false || !nameOfSameVocals.isEmpty()) {
			return -1;
		}
		int i = 0;
		List<Vocaloid> listOfVocals = VocaloidService.vocals;
		while(i < listOfVocals.size()) {
			int v = 0;
			while (v < nameOfSameVocals.size()) {
				if(listOfVocals.get(i).getNameVocaloid().equals(nameOfSameVocals.get(i))) {
					VocaloidService.vocals.remove(i);
					countOfDeletes += 1;
				}
				v++;
			}
			i++;
		}
		
		return countOfDeletes;
	}
	
	public int deleteAllVocalsWithCounter() {
		if(haveVocals() == false) {
			return -1;
		} else {
			//Delete all without count of objects deleted
			//VocaloidService.vocals.removeAll(vocals);
			
			//Delete with a count of objects deleted
			int countOfDeletes = 0;
			int i = 0;
			while (i < VocaloidService.vocals.size()) {
				VocaloidService.vocals.remove(0);
				countOfDeletes += 1;
			}
			return countOfDeletes;
		}
	}
	
	public boolean haveVocals() {
		if(VocaloidService.vocals.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
}
