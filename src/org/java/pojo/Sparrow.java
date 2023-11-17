package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Iflying;

public class Sparrow extends Animal implements Iflying {
	
	private String color;
	private String sparrowSpecies;
	
	public Sparrow(String species, int age, String color, String sparrowSpecies) {
		super(species, age);
		setColor(color);
		setSparrowSpecies(sparrowSpecies);
	}
	
	@Override
	public void letItFly() {
		System.out.println("sto volando!");
	}
	
	@Override
	public void animalNoise() {
		System.out.println("Verso: canto");
	}
	@Override
	public void animalFood() {
		System.out.println("Insetti");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSparrowSpecies() {
		return sparrowSpecies;
	}

	public void setSparrowSpecies(String sparrowSpecies) {
		this.sparrowSpecies = sparrowSpecies;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Colore: " + getColor() + "\n"
				+ "Specie: " + getSparrowSpecies();
	}
}
