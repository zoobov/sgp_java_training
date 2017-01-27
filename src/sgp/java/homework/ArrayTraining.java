package sgp.java.homework;
import java.util.Random;

/**
 * Homework Arrays 
 */
public class ArrayTraining {
	
	/*
	 * Find maximum & minimum element value of the given array and print
	 */
	public void printMinMaxVal(int[] arr){
		int min=0, max=0;
		for (int i=0; i<arr.length; i++) {
			if (i==0) min=max=arr[i]; 
			if (arr[i]< min) min=arr[i];
			if (arr[i]> max) max=arr[i];	
		}
		System.out.println("min=" + min + ", max=" + max);	
	}
	
	/*
	 * Fill array with random numbers 
	 */
	public void randomFill(int[] arr, int max){
		Random r = new Random();
		for (int i=0; i<arr.length; i++) 
			arr[i]=r.nextInt(max)+1;	
		}
	
	/*
	 * Fill 2D array with random numbers 
	 */
	public void randomFill(int[][] arr, int max){
		Random r = new Random();
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) 
				arr[i][j]=r.nextInt(max)+1;
		}
	}
	
	/*
	 * Sort array using selection algorithm  
	 */
	public void sort(int[] arr){
		long iter=0, t=System.nanoTime();
		int tmp=0;
		for(int i=0; i<arr.length; i++ ){
			for(int j=i+1; j<arr.length; j++, iter++){
				if (arr[i]>arr[j]){
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		t=System.nanoTime()-t;
		System.out.println("Total iteration: " + iter  + "\nTotal time: " +  t + " ns");
	}
	
	/*
	 * Sort 2D array using selection algorithm  
	 */
	public void sort(int[][] arr){
		for(int[] ae : arr ) sort(ae);
	}
	
	/*
	 * Sort array using bubble algorithm
	 */
	public void sort3(int[] arr) {
		long iter=0, t=System.nanoTime();
		int tmp; 
		boolean sorted = false;
		while (!sorted){
			sorted=true;
			for (int i=1; i<arr.length; i++, iter++){
				if (arr[i-1]>arr[i]){
					tmp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=tmp;
					sorted=false;
				}
				if (arr[arr.length-(i+1)]>arr[arr.length-i]){
					tmp=arr[arr.length-(i+1)];
					arr[arr.length-(i+1)]=arr[arr.length-i];
					arr[arr.length-i]=tmp;
					sorted=false;
				}
			}

		}	
		t=System.nanoTime()-t;
		System.out.println("Total iteration: " + iter  + "\nTotal time: " +  t + " ns");
	}
	
	
	/*
	 * Sort array using insertion algorithm
	 */
	public void sort2(int[] arr){
		long iter=0, t=System.nanoTime();
		int tmp=0;
		for(int i=1; i<arr.length; i++, iter++){
			tmp=arr[i];
			int j=(i-1);
			for(; (j>=0) && (arr[j]>tmp); j--, iter++)
				arr[j+1]=arr[j];
			arr[j+1]=tmp;
		}
		t=System.nanoTime()-t;
		System.out.println("Total iteration: " + iter  + "\nTotal time: " +  t + " ns ");
	}
	
	/*
	 * Calculate sum of the array elements
	 */
	public long calcSum(int[][] arr){
		int sum=0;
		for(int[] re : arr)
			for(int ce : re)
				sum+=ce;
		return sum;
	}
	
	/*
	 * Print 1D array 
	 */
	public void printArray (int[] arr){
		for(int e : arr) System.out.print(e + " ");
		System.out.println();
	}
	
	/*
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
