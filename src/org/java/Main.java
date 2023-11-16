package org.java;

import org.java.pojo.Dog;
import org.java.pojo.Dolphin;
import org.java.pojo.Eagle;
import org.java.pojo.Sparrow;
import org.java.pojo.functions.Functions;

public class Main extends Functions {
	public static void main(String[] args) {
		
		Dog d = new Dog("Cane", 5, "pastore tedesco");
		Eagle e = new Eagle("Uccello", 3, "Aquila reale");
		Dolphin dd = new Dolphin("Pesce", 1, 2);
		Sparrow s = new Sparrow("Uccello", 1, "Rosso", "Colibri");
		
		System.out.println(d);
		d.animalNoise();
		swim(d);
		System.out.println("------------------------");
		System.out.println(e);
		e.animalNoise();
		fly(e);
		System.out.println("------------------------");
		System.out.println(dd);
		dd.animalNoise();
		swim(dd);
		System.out.println("------------------------");
		System.out.println(s);
		s.animalNoise();
		fly(s);
	}
}
