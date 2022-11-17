package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic {
public static void main(String[] args) {
	
	
	 List<Integer> list = List.of(12,13,56,23,55,99,54,45);
	 
	 //Even Number 
	 List<Integer> collect = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
	 System.out.println(collect);
	 
	 //Odd Number
	 List<Integer> collect2 = list.stream().filter(i -> i%3==0).collect(Collectors.toList());
	 System.out.println(collect2);
	 
	 //Greter than 50
	 
	 List<Integer> collect3 = list.stream().filter(i-> i>=50).collect(Collectors.toList());
	 System.out.println(collect3);
	 
	 //Stream the array
	 
	 String s[]= {"Shubham","Lavish","Pranav","Akash"};
	 
	 Stream<String> stream = Stream.of(s);
	 stream.forEach(e->{
		 System.out.println(e);
	 });
}
}
