package org.java.pojo.functions;

import org.java.pojo.inter.Iflying;
import org.java.pojo.inter.Iswimming;

public class Functions {
	
	public static void fly(Iflying animal) {
		animal.letItFly();
	}
	
	public static void swim(Iswimming animal) {
		animal.letItSwim();
	}
	
}
