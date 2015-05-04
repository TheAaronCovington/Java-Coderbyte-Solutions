/*
 * Description: Using the Java language, have the function ArithGeo(arr) take the array of numbers
 * stored in arr and return the string "Arithmetic" if the sequence follows an arithmetic pattern 
 * or return "Geometric" if it follows a geometric pattern. If the sequence doesn't follow either 
 * pattern return -1. An arithmetic sequence is one where the difference between each of the 
 * numbers is consistent, where as in a geometric sequence, each term after the first is multiplied
 * by some constant or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example: 
 * [2, 6, 18, 54]. Negative numbers may be entered as parameters, 0 will not be entered, and 
 * no array will contain all the same elements. 
 */
import java.util.*; 
import java.io.*;

class Function {  
  String ArithGeo(int[] arr) { 
	  String str = "-1";  
	  if ((arr[1] - arr[0]) == (arr[arr.length-1] - arr[arr.length-2])) {
			  return str = "Arithmetic";
		  }
		else if((arr[1] / arr[0]) == (arr[arr.length-1] / arr[arr.length-2])) {
			  return str = "Geometric";
		  }
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArithGeo(s.nextLine())); 
  }   
  
}
