package com.jay.assorted;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {
	public static void main(String[] args) throws IOException {
		
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
		prods.forEach((prod) -> System.out.println(prod.name));
		System.out.println("-----------------------------");		


		prods
		.stream() //was still a stream of Product
		.map(
			prod -> prod.name.toUpperCase()
		) //now a stream of String. prod below is a string
		.forEach(System.out::println);
		
		double total = 
			prods.stream()
//			.map(prod -> prod.price)
//			.map(Integer::parseInt)
//			.map(prod -> Integer.parseInt(prod.price))
			.collect(Collectors.summingDouble(Product::getPrice));
			
			//.reduce(0, (tempSum, value) -> tempSum + value);
			
		
		System.out.println("total: " +total);
		
//		System.out.println("-----------------------------");		
//		prods.forEach((prod) -> System.out.println(prod.name));
		
		System.out.println("-----------------------------");					
//		Stream.of(
//				new Product(1,"item1", "30"),
//				new Product(3,"item3", "30"),				
//				new Product(4,"item4", "30")
//				)
//		.map(
//			prod -> prod.name.toUpperCase()
//		);
		
		Stream<Product> stream = Stream.<Product>builder()
		.add(new Product(1,"item1", 30))
		.add(new Product(3,"item3", 30))
		.add(new Product(4,"item4", 30))
		.add(new Product(5,"item4", 450))
		.add(new Product(6,"item4", 90))
		.add(new Product(7,"item4", 30))
		.build();

//		stream = stream.filter(item -> item.price=="30" && item.name.equals("item4"));
		stream = stream
				.filter(item -> item.price==30)
				.filter(item -> item.name.equals("item4"));

		
		//below throws exception
//		lcStream = stream.map(
//			(Product prod) -> {return prod.name.toLowerCase();}
//		);
				
		stream.forEach(System.out::println);
		stream.close();
		
		System.out.println("-----------------------------");	
//		Stream stream2 = Stream.iterate(50, n -> n + 5).limit(10);
//		stream2.forEach(System.out::println);
		
//		String name = "jay menorca";
//		IntStream intname = name.chars();
//		intname.forEach(System.out::println);
		
//		Path path = Paths.get("testFile.txt");
//		Stream<String> streamOfStrings = Files.lines(path);
//		Stream<String> streamWithCharset = 
//		  Files.lines(path, Charset.forName("UTF-8"));

//		Stream<String> onceModifiedStream =
//				  Stream.of("abcd", "bbcd", "cbcd").skip(1)
//				  .map(element -> element.substring(0, 3));

		
		List<String> list = Arrays.asList("jhay","jay2","abc1", "abc2", "abc7");
		counter = 0;
		Optional<String> streamY = list.stream().filter(element -> {
		    System.out.println("filter() was called");
		    return element.contains("a");
		}).map(element -> {
			System.out.println("map() was called");
		    return element.toUpperCase();
		}).findFirst();
		
		streamY.stream().forEach(System.out::println);
		//streamY.forEach(System.out::println);
		
		System.out.println("-----------------------------");	
		String[] col={"Name","id","tra_id","tra_amt"};
		String[] values={"ss","123","a123","450.00"};

		Map<Object, Object> result = IntStream
		.range(0, col.length)
		.boxed()
		.collect(
			Collectors.toMap(i -> col[i], i -> values[i])
		);
		System.out.println(result);

		
//		IntStream istream0 = IntStream.iterate(0, i -> i<col.length, i -> i+1);
//		Map<Object, Object> result = 
//		istream0.boxed()
//		.collect(
//			Collectors.toMap(i -> col[i], i -> values[i])
//		);
//		System.out.println(result);
		
		
//		System.out.println("-----------------------------");	
//		IntStream istream0 = IntStream.iterate(0, i -> i<col.length, i -> i+1);
//		istream0.forEach(System.out::println);
//
//		
//		System.out.println("-----------------------------");	
//		IntStream istream = IntStream.range(0, col.length);
//		istream.forEach(System.out::println);

	
	}
	
	private static long counter;
	 
	private static void wasCalled() {
	    counter++;
	}
}