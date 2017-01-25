/**
 * 
 */
package sgp.java.homework;

import java.util.Arrays;

/**
 * ImArrayMerger improved ArrayMerger
 *
 */
public class ImArrayMerger {
	
	public static int[] merge(int[] arr0, int[] arr1) {
		int[] result = new int[arr1.length + arr0.length];
		 int i=0,j=0; 
		 
	     System.out.println("arr0 - " + Arrays.toString(arr0));
	     System.out.println("arr1 - " + Arrays.toString(arr1));
	     
	     for(;(i<arr0.length && j<arr1.length);){
	       	result[i+j]=(arr0[i]<=arr1[j]) ? arr0[i++] : arr1[j++];
	       	System.out.println("---" + Arrays.toString(result)); 
	     } 
	 
	     if (i==arr0.length){
	    	 System.arraycopy(arr1, j, result, arr0.length+j, arr1.length-j);
	     } else {
	    	 System.arraycopy(arr0, i, result, arr1.length+i, arr0.length-i);
	     }
	     System.out.println("===" + Arrays.toString(result));
	    
	     return result;   
	}

}
