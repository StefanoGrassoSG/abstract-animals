package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Iswimming;

public class Dog extends Animal implements Iswimming{
	
	private String breed;
	
	public Dog(String species, int age, String breed) {
		super(species, age);
		setBreed(breed);
	}
	
	@Override
	public void letItSwim() {
		System.out.println("sto nuotando!");
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void animalNoise() {
		System.out.println("Verso: abbaio");
	}
	@Override
	public void animalFood() {
		System.out.println("Crocchette");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Razza: " + getBreed();
	}
}
