package Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enitity.Person;

public class Utils {
	static Scanner s = new Scanner(System.in);
	
	public static int[] inputNumbers() {
		System.out.println("enter 2 numbers");
		int nums[] = new int[2];
		for(int i = 0; i < 2; i++) {
			System.out.println("enter number: " + i);
			nums[i] = s.nextInt();
		}
		return nums;
	}
	
	public static List<Person> inputPersons() {
		System.out.println("enter details of 2 persons");
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < 2; i++) {
			System.out.println("enter person: " + i);
			System.out.println("enter name");
			String name = s.nextLine();
			System.out.println("enter age");
			int age = s.nextInt();
			s.nextLine();
			persons.add(new Person(i, name, age));
		}
		return persons;
	}
	
	public static void printPersonsAgeSum(int personsAgeSum) {
		System.out.println("Sum of age of persons: " + personsAgeSum);
	}
	
	public static void printNumbersSum(int num) {
		System.out.println("entered numbers sum after reduce is: ");
			System.out.println(num);
	}
	
	public static void printPersons(List<Person> persons, String operation) {
		System.out.println("entered persons after " + operation + " are: ");
		
		for(int i = 0; i < persons.size(); i++) {
			System.out.println("ID: " + persons.get(i).ID);
			System.out.println("Name: " + persons.get(i).name);
			System.out.println("Age: " + persons.get(i).age);
		}
	}
	
	
	public static void printNumbers(int[] nums, String operation) {
		System.out.println("entered numbers after " + operation + " are: ");
		for(int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}

}
