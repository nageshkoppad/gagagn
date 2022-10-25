package stream.xworkz.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.stream.events.StartElement;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;

public class Streams {

	public static void main(String[] args) {
		
		List<String> arg =new ArrayList<>();
		
		arg.add("ankhdiDRLk");
		arg.add("hokgong");
		arg.add("sgbcdsgybk");
		
		for (String string : arg) {
			
		}
	     
		List<String> r=arg.stream()
		.filter(string->string.startsWith("a"))
		.filter(string->string.endsWith("k"))
		.filter(string->string.contains("L"))
		.filter(string->string.contains("D"))
		.filter(string->string.contains("R"))
		.filter(string->string.contains("h"))
		.filter(string->string.length()>10)
		.collect(Collectors.toList());
		
		System.out.println(r);
		
	}

}
