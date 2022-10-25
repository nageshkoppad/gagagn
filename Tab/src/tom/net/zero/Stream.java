package tom.net.zero;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	public static void main(String[] args) {

		List<String> one = new ArrayList<>();

		one.add("aarnaLDhRtakak");
		one.add("kerala");
		one.add("tamilunadu");
		one.add("chennai");
		
		one.forEach(ref->System.out.println());
		one.stream().filter(ref->ref.startsWith("a"))
		.filter(ref->ref.endsWith("k"))
		.filter(ref->ref.contains("L"))
		.filter(ref->ref.contains("D"))
		.filter(ref->ref.contains("R"))
		.filter(ref->ref.contains("h"))
		.filter(ref->ref.length()>10).forEach(ref->System.out.println(ref));
	}

}
