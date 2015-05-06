/*
 * Description: Using the Java language, have the function SecondGreatLow(arr) take the array
 * of numbers stored in arr and return the second lowest and second greatest numbers, respectively,
 * separated by a space. For example: if arr contains [7, 7, 12, 98, 106] the output should be 12
 * 98. The array will not be empty and will contain at least 2 numbers. It can get tricky if 
 * there's just two numbers! 
 */
import java.util.*; 
import java.io.*;

class Function {  
  String SecondGreatLow(int[] arr) { 
	  int secondLow = 0, secondGreat = 0, low, great;
	  Arrays.sort(arr);
	  low = arr[0]; 
	  great = arr[arr.length-1];
	  
	  if(arr.length == 2) {
		  if(arr[0] == arr[1]) {
			  secondLow = arr[0];
			  secondGreat = arr[1];
			  return secondLow + " " + secondGreat;
		  }
		  else {
			  secondLow = arr[1];
			  secondGreat = arr[0];
			  return secondLow + " " + secondGreat;
		  }
	  }
  
	  for(int i = 0; i < arr.length; i++) {
	  		if(arr[i] > low){
	  			secondLow = arr[i];
	  			break;
	  		}
	  }
	  for(int i = arr.length-1; i >= 0; i--) {
		  if(arr[i] < great) {
			  secondGreat = arr[i];
			  break;
		  }
	  }
        
    return secondLow + " " + secondGreat;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SecondGreatLow(s.nextLine())); 
  }   
  
}
