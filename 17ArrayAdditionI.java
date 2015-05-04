/*
 * Description: Using the Java language, have the function ArrayAdditionI(arr) take the array
 * of numbers stored in arr and return the string true if any combination of numbers in the 
 * array can be added up to equal the largest number in the array, otherwise return the string 
 * false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because
 * 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, and
 * may contain negative numbers. 
 */
import java.util.*; 
import java.io.*;

class Function {  
  static String ArrayAdditionI(int[] arr) { 
	  Arrays.sort(arr);
	  int largest = arr[arr.length-1];
	  int sum = 0;
	  
	  for(int i = 0; i < arr.length-1; i++) {
		  for(int j = 1; j < arr.length-2; j++) {
			  if(arr[i] + arr[j] == largest) {
				  return "true";
			  }
			  else if(arr[i] + arr[j] < largest) {
				  sum = sum + arr[i] + arr[j];
				  if(sum < largest) {
					  continue;
				  }
				  else if (sum == largest){
					  return "true";
				  }
				  else if(sum > largest) {
					  sum = 0;
					  continue;
				  }
			  }
			  else if (arr[i] + arr[j] > largest) {
				  sum = 0;
				  continue;
			  }
		  }
	  }
    return "false";
    
  } 

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArrayAdditionI(s.nextLine())); 
  }   
  
}
