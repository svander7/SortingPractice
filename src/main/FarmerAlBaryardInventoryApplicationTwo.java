package main;

import java.util.Arrays;

import main.animals.Pig;
import main.service.FileService;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		String[] pigNames = new String[4];

		for (int i = 0; i < pigs.length; i++) {
            pigNames[i] = pigs[i].getName();
        }
		
		Arrays.sort(pigNames);
		
		for (Pig pig : pigs) {
			System.out.println(pig.getName());
		}
		
		
		// SORT the pigs by name...
		
		// 1. run a for loop on the pig array
		// 2. In the for loop create an array called pig names, get the names of the pigs using
		// the getName getter from the Pig class, save it into the pigNames string array
		// 3. Sort the pig names
		// 4. Print the sorted names to the console

	}

}
