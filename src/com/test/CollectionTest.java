package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import com.test.dto.IntWrapper;
import com.test.dto.Student;

public class CollectionTest {

	private static List<Student> students=Arrays.asList(new Student("Samik", true,10),
			new Student("Subhra", true,20),
			new Student("Ajay", false,10));
	
	public static void main(String[] args) {
		CollectionTest ct = new CollectionTest();
		/**
		 * new Predicate(){
		 * 	public boolean test(Student s){
		 * 		return s.isActive();
		 * 	}
		 * 
		 * }
		 * 
		 * */
		students.stream().filter(Student::isActive);
		
		
		
		/**
		 * new Predicate(){
		 * 	public boolean test(Student s){
		 * 		return ct.checkByInstance(s);
		 * 	}
		 * 
		 * }
		 * 
		 * */
		students.stream().filter(ct::checkByInstance);
		
		
		//T-> R
		
		
		students.stream()
		.map(Student::getAge)
		.map(IntWrapper::new);  // map(i -> new IntWrapper(i)) 
		
		Random random=new Random();
		Stream.generate(random::nextInt)
		.map(IntWrapper::new)
		.limit(10)
		.map(IntWrapper::toString)
		.forEach(System.out::println);
	}
	
	
	//obj-> boolean
	
	/**
	 * new Predicate(){
	 * 	public boolean test(Student s){
	 * 		return CollectionTest.check(s);
	 * 	}
	 * 
	 * }
	 * 
	 * */
	
	static boolean check(Student s) {
		return s.isActive();
	}
	
	boolean checkByInstance(Student s) {
		return s.isActive();
	}
	
	
	
	

}
