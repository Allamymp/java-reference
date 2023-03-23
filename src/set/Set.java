package set;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {

	public static void main(String[] args) {
		 
		
		// most fast but unordered
		java.util.Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Tv");
		hashSet.add("Notebook");
		hashSet.add("Cellphone");
		hashSet.add("Tablet");
	
		
			 
		System.out.println(hashSet);
		System.out.println(hashSet.contains("Tv"));
		
		hashSet.remove("Cellphone");
		System.out.println(hashSet);
		hashSet.removeAll(hashSet);
		System.out.println(hashSet);
	 
		System.out.println("---------------");
		
		// slowly but ordered
		
		java.util.Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Orange");
		treeSet.add("Apple");
		treeSet.add("Melon");
		treeSet.add("Avocado");
		
		System.out.println(treeSet);
		treeSet.removeIf(x->x.charAt(0)!='O');
		System.out.println(treeSet);
		
		System.out.println("---------------");

		
		// mid term speed and keep the insertion order
		
		java.util.Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Real Madrid");
		linkedHashSet.add("Barcelona");
		linkedHashSet.add("Sevilla");
		linkedHashSet.add("Betis");
		
		System.out.println(linkedHashSet);
		
		System.out.println("---------------");
		
		// union, intersection, diference
		
		java.util.Set<String> listA = new TreeSet<>(Arrays.asList("Joao","Pedro","Paulo","Mateus","Ester"));
		java.util.Set<String> listB = new TreeSet<>(Arrays.asList("Maria","Madalena","Rute","Mateus","Ester"));
		
		System.out.println(listA);
		System.out.println(listB);
		System.out.println("---------------");
		
		//union
		java.util.Set<String> unionExample = new TreeSet<>(listA);
		unionExample.addAll(listB);
		System.out.println(unionExample);
		System.out.println("---------------");
		
		//Intersection
		
		java.util.Set<String> intersectionExample = new TreeSet<>(listA);
		intersectionExample.retainAll(listB);
		System.out.println(intersectionExample);
		System.out.println("---------------");
		
		//Difference
		
		java.util.Set<String> differenceExample = new TreeSet<>(listA);
		differenceExample.removeAll(listB);
		System.out.println(differenceExample);

	}

}
