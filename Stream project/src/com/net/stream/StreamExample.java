package com.net.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Manipur");
		list.add("Meghalaya");
		list.add("Mizoram");
		list.add("Jharkhand");
		list.add("Karnataka");
		list.add("Kerala");
		list.add("Madhya Pradesh");
		list.add("Maharashtra");
		list.add("Sikkim");
		list.add("Tamil Nadu");
		list.add("Telangana");
		list.add("Tripura");
		list.add("Uttarakhand");
		list.add("Uttar Pradesh");
		list.add("West Bengal");
		list.add("Andhra Pradesh");
		list.add("Arunachal Pradesh");
		list.add("Assam");
		list.add("Bihar");
		list.add("Chhattisgarh");
		list.add("Nagaland");
		list.add("Odisha");
		list.add("Punjab");
		list.add("Rajastan");
		list.add("Goa");
		list.add("Gujarat");
		list.add("Haryana");
		list.add("Himachal Pradesh");

		list.forEach((ref) -> System.out.println("state name :" + ref));// all states are displayed
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.endsWith("a")).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.startsWith("K")).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.contains("L")).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.contains("D")).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.contains("R")).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.contains("h")).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.length() > 10).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().filter((ref) -> ref.length() < 5).forEach(ref -> System.out.println(ref));
		System.out.println("******************************");
		list.stream().forEach((ref) -> System.out.println(ref.toUpperCase()));
		System.out.println("******************************");
		list.stream().forEach((ref) -> System.out.println(ref.toLowerCase()));
		System.out.println("******************************");
		list.stream().forEach((ref) -> System.out.println(new StringBuffer().append(ref).reverse()));
		System.out.println("******************************");

		list.stream().distinct().forEach((ref) -> System.out.println(ref));

	}

}
