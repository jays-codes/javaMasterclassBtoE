package com.jay.assorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {

		//anonymous implementation
		Comparator<String> strComp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}		
		};
		
		int res = strComp.compare("Jay", "daddy");
		System.out.println("result: " + res);
		
		//Lambda implementation
		//Comparator<String> strComp2 =  (o1,o2) -> o1.compareTo(o2);
		Comparator<String> strComp2 =  (o1,o2) -> {
			System.out.println("Printed from inside lambda!!!: " + o1 + o2);
			return 123;
		};
		
		int res2 = strComp2.compare("Jay", "daddy");
		System.out.println("result: " + res2);
		
		Drawable drawable = (width, height) -> System.out.println("width: " + width 
				+ "\nheight: " + height);
		drawable.draw(14, 15);
		
		System.out.println("\n"); 
		List<String> names = new ArrayList<>();
		names.add("jay");
		names.add("jay45");
		names.add("jay99");

		names.forEach(
			(name) -> System.out.println(name)
		);
	}

}
