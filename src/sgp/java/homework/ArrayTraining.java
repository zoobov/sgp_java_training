package sgp.java.homework;
import java.util.Random;

/**
 * Homework Arrays 
 */
public class ArrayTraining {
	
	/**
	 * Find maximum & minimum element value of the given array
	 */
	public void findMinMax(int[] arr){
		
		/* find maximum & minimum value */
		int min=0, max=0;
		for (int i=0; i<arr.length; i++) {
			if (i==0) min=max=arr[i]; 
			if (arr[i]< min) min=arr[i];
			if (arr[i]> max) max=arr[i];	
		}
		for(int e : arr) System.out.print(e + " ");
		System.out.println();
		System.out.println("min=" + min + " max=" + max);	
	}
	
	/**
	 * Fill with random numbers
	 */
	public void randomFill(int[][] arr, int max){
		Random r = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j]=r.nextInt(max);
			}
		}
	}
	
	/**
	 * Calculate sum and print it to console
	 */
	public void printSum(int[][] arr){
		
	}
}
