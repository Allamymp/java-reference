package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		// Orange is a generic type created
		 List<Orange> box = new ArrayList<>();
		 box.add(new Orange(1));
		 
		Orange orange = box.get(0);
		
		System.out.println(orange.getUnits());
		System.out.println(orange.getClass());
	}

	public void Orange() {

	}
}
