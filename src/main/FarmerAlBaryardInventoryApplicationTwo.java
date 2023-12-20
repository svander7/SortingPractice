package main;

import java.util.Arrays;

import main.animals.Pig;
import main.service.FileService;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		String[] pigNames = new String[4];
		
		// Try displaying the array to the console, then sort it.
		
		pigNames[0] = pig;
		pigNames[1] = pig1;
  		
		// SORT the pigs by name...
		
		Arrays.sort(pigs, (pig1, pig2) -> pig1.getName().compareTo(pig2.getName()));
		System.out.println("Sorted pig names:");
		for (String pig : pigNames) {
			System.out.println(pigNames);
		}
		
//		for (String pig : pigNames) {
//			System.out.println(pigNames);
//		}
		// 1. run a for loop on the pig array
		// 2. In the for loop create an array called pig names, get the names of the pigs using
		// the getName getter from the Pig class, save it into the pigNames string array
		// 3. Sort the pig names
		// 4. Print the sorted names to the console

	}

}
