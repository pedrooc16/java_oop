package bounded_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class application {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(5,11,13,25);
		List<Double> doubles= Arrays.asList(5.20,3.30,4.60);
		List<? super Number> objs = new ArrayList<>();
		copy(ints, objs);
		copy(doubles, objs);
		objs.add(ints.get(0));
			System.out.println(objs);
			Object x = objs.get(0);
			x = objs.get(1);
			x = objs.getClass(2)
	}
	
	public static void copy(List<? extends Number> numbers, List<? super Number> objs) {
		for (Number n : numbers) {
			objs.add(n);
		}
	}
	
}
	
	
	

