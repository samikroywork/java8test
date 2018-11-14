package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.test.dto.Student;

public class CollectionStreamTest {

	private static List<Student> students=Arrays.asList(new Student("Samik", true,10),
			new Student("Subhra", true,20),
			new Student("Ajay", false,10));
	
	public static void main(String[] args) {
		
		/*List<Integer> items=students.stream()
		.map(Student::getAge)
		.map(x-> x+10)
		.collect(Collectors.toList());
		
		
		int r=students.stream()
		.map(Student::getAge)
		.map(x-> x+10).reduce(0,CollectionStreamTest::sum);
		
		System.out.println(r);*/
		
		System.out.println(isPrime(9));
		System.out.println(isPrime(5));
		
		Map<Integer,List<Student>> grp=students.stream()
		.collect(Collectors.groupingBy(Student::getAge));
		
		System.out.println(grp);
		
	}
	
	
	static int sum(int x,int y) {
		return x+y;
	}
	
	
	static boolean isPrime(int n) {
		return IntStream
				.rangeClosed(2, (int)Math.sqrt(n))
				.noneMatch(x ->n%x==0);
	}
	
	
}
