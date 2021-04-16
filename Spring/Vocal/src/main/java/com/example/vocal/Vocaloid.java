package com.example.vocal;

import java.util.ArrayList;

public class Vocaloid {
	
	//Attributes
	//To-Do 
	//Change the two ArrayList of String for String
	private String nameVocaloid;
	private ArrayList<String> listOfModules;
	private ArrayList<String> songsFromVocaloid;
	
	//Constructor
	public Vocaloid() {}
	public Vocaloid(String nameVocaloid) {
		this.nameVocaloid = nameVocaloid;
		this.listOfModules = new ArrayList<String>();
		this.songsFromVocaloid = new ArrayList<String>();
	}
	public Vocaloid(String nameVocaloid, ArrayList<String> listOfModules, ArrayList<String> songsFromVocaloid) {
		this.nameVocaloid = nameVocaloid;
		this.listOfModules = listOfModules;
		this.songsFromVocaloid = songsFromVocaloid;
	}
	
	
	//Getters and Setters
	public String getNameVocaloid() {
		return nameVocaloid;
	}
	public void setNameVocaloid(String nameVocaloid) {
		this.nameVocaloid = nameVocaloid;
	}
	public ArrayList<String> getListOfModules() {
		return listOfModules;
	}
	public void setListOfModules(ArrayList<String> listOfModules) {
		this.listOfModules = listOfModules;
	}
	public ArrayList<String> getSongsFromVocaloid() {
		return songsFromVocaloid;
	}
	public void setSongsFromVocaloid(ArrayList<String> songsFromVocaloid) {
		this.songsFromVocaloid = songsFromVocaloid;
	}
	@Override
	public String toString() {
		return "Vocaloid: " + nameVocaloid
				+ "\nmodules :" + listOfModules
				+ ", songsFromVocaloid: " + songsFromVocaloid + "\n";
	}
	
	
	
}
