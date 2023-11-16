package org.java.pojo.abs;

public abstract class Animal {
	
	private String species;
	private int age;
	
	public Animal (String species, int age) {
		setSpecies(species);
		setAge(age);
	}
	
	public abstract void animalNoise();

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("zzz");
	}
	
	@Override
	public String toString() {
		return "Specie: " + getSpecies() + "\n"
				+ "Età: " + getAge();
	}
}
