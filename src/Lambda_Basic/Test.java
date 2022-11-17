package Lambda_Basic;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {		
	
		 List<Integer> ints = Stream.of(1,2,4,3,5).collect(Collectors.toList());
		    Integer maxnum = ints.stream()
		                              .max(Comparator.comparing(i -> i))
		                              .get();

		    System.out.println("Maximum number in the set is " + maxnum);
}
}
