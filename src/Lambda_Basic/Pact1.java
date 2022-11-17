package Lambda_Basic;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pact1 {
public static void main(String[] args) {
	
	 List<Integer> list = Stream.of(10,20,5,77,56,77).collect(Collectors.toList());
	  Integer max = list.stream().max(Comparator.comparing(i ->i)).get();
	  System.out.println(max);
	
	
}

}
