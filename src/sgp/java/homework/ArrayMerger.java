/**
 * 
 */
package sgp.java.homework;

import java.util.Arrays;

/**
 * ArrayMerger method merge had the flaws!
 * it was fixed below with comments...
 */
public class ArrayMerger {
	
	public static int[] merge(int[] arr0, int[] arr1) {
        int[] result = new int[arr1.length + arr0.length];

        System.out.println("arr0 - " + Arrays.toString(arr0));
        System.out.println("arr1 - " + Arrays.toString(arr1));

        int index0 = 0;
        int index1 = 0;
        boolean done=false; //needed to quit the while loop
        
        //while (index0 + index1 != result.length - 2) { //last or even two last elements may be not copied
        while (!done) { 
            if (index0 < arr0.length && index1 < arr1.length) {
                if (arr0[index0] <= arr1[index1]) {
                    result[index0 + index1] = arr0[index0++];     
                } else {
                    result[index0 + index1] = arr1[index1++];
                }
            } else if (index0 == arr0.length) {
                //index0 = arr0.length - 1; 
                //System.arraycopy(arr1, index1, result, index1 + index0 + 1, arr1.length - index1);
                System.arraycopy(arr1, index1, result, index1 + arr0.length, arr1.length - index1);
                done= true; 
                
            } else if (index1 == arr1.length) {
                //index1 = arr1.length - 1;
                //System.arraycopy(arr0, index0, result, index1 + index0 + 1, arr0.length - index0);
                System.arraycopy(arr0, index0, result, index0 + arr1.length, arr0.length - index0);
                done= true;
            }
            System.out.println("---" + Arrays.toString(result));
        }
        return result;
        
    }

}

