package sgp.java.homework;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		 * homework: Switch implementation test
		 */
		MonthSwitch mSwitch = new MonthSwitch(9);
		mSwitch.printSeason();
		
		/*
		 * homework: print minimum and maximum item values of array
		 */
		ArrayTraining at = new ArrayTraining();{
		int[] arr0 = {7,23,-8,50,69,27,12,43,5,32};
		at.printArray(arr0);
		System.out.println(Arrays.toString(arr0));
		at.printMinMaxVal(arr0);
		}
		
		/*
		 * homework: randomly fill 5x8 array, get sum of all it's elements
		 */{
		int[][] arr0 = new int[5][8];
		at.randomFill(arr0, 99);
		at.printArray(arr0);
		System.out.println("Sum: " + at.calcSum(arr0));
		}
		
		/*
		 * homework: array sort methods implementation test
		 */{
		int[] arr0 = new int[30];
		int[] arr1 = new int[30];
		at.randomFill(arr0, 100);
		System.arraycopy(arr0, 0, arr1, 0, arr0.length);
		at.printArray(arr0);
		at.sort2(arr0);
		at.printArray(arr0);
		at.printArray(arr1);
		at.sort3(arr1);
		at.printArray(arr1);
		}
		
		/*
		 * homework: array[10], copy 3 1st items to it's end 
		 */{
		int[] arr0 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr0));
		System.arraycopy(arr0, 0, arr0, arr0.length-3, 3);
		System.out.println(Arrays.toString(arr0));	
		}
		/*
		 * homework: consideration of method merge 
		 */{
		int[] arr0 = {1, 2, 5, 6, 8, 13};
        int[] arr1 = {2, 4, 5};
        System.out.println(Arrays.toString(ArrayMerger.merge(arr0, arr1))); //original (fixed code flaws!) 
        System.out.println(Arrays.toString(ImArrayMerger.merge(arr0, arr1)));//improved version
		}
	}

}
