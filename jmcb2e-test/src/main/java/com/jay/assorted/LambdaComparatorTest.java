package com.jay.assorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorTest {
	public static void main(String[] args) {
		
		List<Product> prods = new ArrayList<>();
		prods.add(new Product(12,"xbox", 250));
		prods.add(new Product(14,"xbox series x", 750));
		prods.add(new Product(1,"gpd win max", 750));
		prods.add(new Product(12,"gpd micro pc", 800));
		
		prods.forEach((prod) -> System.out.println(prod.name));
		
		System.out.println("-----------------------------");
//		Collections.sort(prods, (p1,p2)-> {
//			return p1.name.compareTo(p2.name);
//		});

		Collections.sort(prods, Comparator.comparing(p -> p.name));

		//prods.forEach((prod) -> System.out.println(prod.name));
		prods.stream().map(prod -> prod.name).forEach(System.out::println);


	}
}
