package Map;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import Utilities.Utils;

import enitity.Person;

public class MapDemo {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter 1 for numbers");
		System.out.println("enter 2 for entities");
		
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
			case 1: int nums[] = Utils.inputNumbers(); 
			int[] incrementedNumbers = Arrays.stream(nums).map(n -> n + 2).toArray();
			Utils.printNumbers(incrementedNumbers, "map");
			break;
			
			case 2: List<Person> persons = Utils.inputPersons();
			List<Person> changedPersons = persons.stream().map(p -> {
				p.age += 3;
				return p;
			}).collect(Collectors.toList());
			Utils.printPersons(changedPersons, "map");
			break;
		}
	}
}
