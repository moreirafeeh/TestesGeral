package com.lipe.teste.guava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.base.Optional;

public class Program {

	public static void main(String[] args) {
		
		//TESTANDO GUAVA OPTIONAL--------
//		  Program guavaTester = new Program();
//
//	      Integer value1 =  null;
//	      Integer value2 =  new Integer(10);
//	      
//	      //Optional.fromNullable - allows passed parameter to be null.
//	      Optional<Integer> a = Optional.fromNullable(value1);
//	      
//	      //Optional.of - throws NullPointerException if passed parameter is null
//	      Optional<Integer> b = Optional.of(value2);		
//
//	      System.out.println(guavaTester.sum(a,b));
//	      
	     //--------------------------------
		
		List<String> list =  new ArrayList<String>();
		list.add("batata");
		list.add("xablau");
		list.add("abacaxi");
		list.add("cenoura");
		
		//list.sort((a1, a2) -> a1.compareTo(a2));
		
		List<String> filtrado =  list.stream().filter(a1 -> a1.contains("ba")).collect(Collectors.toList());
		
		System.out.println(filtrado);
	   }

	   public Integer sum(Optional<Integer> a, Optional<Integer> b) {
	      //Optional.isPresent - checks the value is present or not
	      System.out.println("First parameter is present: " + a.isPresent());

	      System.out.println("Second parameter is present: " + b.isPresent());

	      //Optional.or - returns the value if present otherwise returns
	      //the default value passed.
	      Integer value1 = a.or(new Integer(0));	

	      //Optional.get - gets the value, value should be present
	      Integer value2 = b.get();

	      return value1 + value2;
	   }	

}
