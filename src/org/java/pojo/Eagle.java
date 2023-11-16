package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Iflying;

public class Eagle extends Animal implements Iflying{
	
	private String eagleSpecies;

	public Eagle(String species, int age, String eagleSpecies) {
		super(species, age);
		setEagleSpecies(eagleSpecies);
	}

	@Override
	public void letItFly() {
		System.out.println("sto volando!");
	}

	@Override
	public void animalNoise() {
		System.out.println("Verso: fischio acuto");
	}

	public String getEagleSpecies() {
		return eagleSpecies;
	}

	public void setEagleSpecies(String eagleSpecies) {
		this.eagleSpecies = eagleSpecies;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "specie: " + getEagleSpecies();
	}
}
