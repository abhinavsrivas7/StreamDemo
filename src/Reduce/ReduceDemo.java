package Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Utilities.Utils;
import enitity.Person;

public class ReduceDemo {
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter 1 for numbers");
		System.out.println("enter 2 for entities");
		
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
			case 1: int nums[] = Utils.inputNumbers(); 
			int sum = Arrays.stream(nums).reduce(0, (partialResult, current) -> partialResult + current);
			Utils.printNumbersSum(sum);
			break;
			
			case 2: List<Person> persons = Utils.inputPersons();
			int personsAgeSum = persons.stream().reduce(0, (partialAgeSum, p) -> partialAgeSum + p.age, Integer::sum);
			Utils.printPersonsAgeSum(personsAgeSum);
			break;
		}
	}
}
