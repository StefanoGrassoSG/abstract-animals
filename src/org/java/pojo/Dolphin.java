package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.inter.Iswimming;

public class Dolphin extends Animal implements Iswimming{
	
	private int length;
	
	public Dolphin(String species, int age, int length) {
		super(species, age);
		setLength(length);
	}
	
	@Override
	public void letItSwim() {
		System.out.println("sto nuotando!");
	}

	@Override
	public void animalNoise() {
		System.out.println("Verso: fischio");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Lunghezza: " + getLength() + " Metri";
	}
}
