package DateTimeAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		
	
 List<Integer> list = List.of(1,2,3,4,5,63,7);
 List<Integer> collect = list.stream().filter(i->i%2==0).collect(Collectors.toList());
 System.out.println(collect);
 
 List<Integer> collect2 = list.stream().filter(i->i%3==0).collect(Collectors.toList());
 System.out.println(collect2);
 
 List<Integer> collect3 = list.stream().filter(i-> i>=5).collect(Collectors.toList());
 System.out.println(collect3);
 
List<String> b = Arrays.asList("Ashu","asy","sss");

List<String> collect4 = b.stream().filter(a->a.startsWith("a")).collect(Collectors.toList());
System.out.println(collect4);

}
	}