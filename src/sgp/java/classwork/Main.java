package sgp.java.classwork;

import java.util.Arrays;

import sgp.java.homework.*;
public class Main {

	public static void main(String[] args) {
		MonthSwitch mSwitch = new MonthSwitch(4);
		mSwitch.printSeason();
		
		ArrayTraining at = new ArrayTraining();
		int[] arr0 = {7,23,-8,50,69,27,12,43,5,32};
		at.findMinMax(arr0);
		
		int[][] arr2 = new int[5][8];
		at.randomFill(arr2, 99);
		at.printArray(arr2);
		System.out.println("Sum: " + at.calcSum(arr2));
		
	}

}
