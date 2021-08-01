package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import enitity.Person;

public class MapDemo {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter 1 for numbers");
		System.out.println("enter 2 for entities");
		
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
			case 1: int nums[] = inputNumbers(); 
			int[] incrementedNumbers = Arrays.stream(nums).map(n -> n + 2).toArray();
			printNumbers(incrementedNumbers);
			break;
			
			case 2: List<Person> persons = inputPersons();
			List<Person> changedPersons = persons.stream().map(p -> {
				p.age += 3;
				return p;
			}).collect(Collectors.toList());
			printPersons(changedPersons);
			break;
		}
	}
	
	private static List<Person> inputPersons() {
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
	
	private static void printPersons(List<Person> persons) {
		System.out.println("entered persons after modification are: ");
		for(int i = 0; i < 2; i++) {
			System.out.println("ID: " + persons.get(i).ID);
			System.out.println("Name: " + persons.get(i).name);
			System.out.println("Age: " + persons.get(i).age);
		}
	}
	
	private static int[] inputNumbers() {
		System.out.println("enter 2 numbers");
		int nums[] = new int[2];
		for(int i = 0; i < 2; i++) {
			System.out.println("enter number: " + i);
			nums[i] = s.nextInt();
		}
		return nums;
	}
	
	private static void printNumbers(int[] nums) {
		System.out.println("entered numbers after modification are: ");
		for(int i = 0; i < 2; i++)
			System.out.println(nums[i]);
	}
}
