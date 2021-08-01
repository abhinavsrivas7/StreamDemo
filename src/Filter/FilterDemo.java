package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Utilities.Utils;
import enitity.Person;

public class FilterDemo {
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter 1 for numbers");
		System.out.println("enter 2 for entities");
		
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
			case 1: int nums[] = Utils.inputNumbers(); 
			int[] filteredNumbers = Arrays.stream(nums).filter(n -> n > 3).toArray();
			Utils.printNumbers(filteredNumbers, "filter");
			break;
			
			case 2: List<Person> persons = Utils.inputPersons();
			List<Person> filteredPersons = persons.stream().filter(p -> {
				if(p.age > 23) return true;
				return false;
			}).collect(Collectors.toList());
			Utils.printPersons(filteredPersons, "filter");
			break;
		}
	}
}
