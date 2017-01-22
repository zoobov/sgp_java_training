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
				arr[i][j]=r.nextInt(max)+1;
			}
		}
	}
	
	/**
	 * Calculate sum of the array elements
	 */
	public long calcSum(int[][] arr){
		int sum=0;
		for(int[] re : arr){
			for(int ce : re){
				sum+=ce;
			}
		}
		return sum;
	}
	
	/**
	 * Print 1D array 
	 */
	public void printArray (int[] arr){
		for(int e : arr) System.out.print(e + " ");
		System.out.println();
	}
	
	/**
	 * Print 2D array 
	 */
	public void printArray (int[][] arr){
		for(int[] re : arr){
			for(int ce : re){
				System.out.print(ce + " ");
			}
			System.out.println();	
		}
	}
}
