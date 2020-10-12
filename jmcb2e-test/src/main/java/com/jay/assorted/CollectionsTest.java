package com.jay.assorted;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTest {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		int[] nos = {1,33,64,12,11,9,99,2,3,5,2,8,9,2};
		
		for (int i=0;i<nos.length;i++) {
			set.add(nos[i]);			
		}

		System.out.println("size: " + set.size());
		System.out.println("set: " + set);
		
		Set<Object> set2 = new LinkedHashSet<>();
		set2.add("jay");
		set2.add("jayx");
		set2.add("boom");
		
		Iterator<Object> iter = set2.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}


	}

}
