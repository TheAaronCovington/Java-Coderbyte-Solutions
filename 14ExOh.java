/*
 * Description: Using the Java language, have the function  ExOh(str) take
 * the str parameter being passed and return the string true if there is 
 * an equal number of x's and o's, otherwise return the string false. Only 
 * these two letters will be entered in the string, no punctuation or numbers.
 * For example: if str is "xooxxxxooxo" then the output should return false 
 * because there are 6 x's and 5 o's. 
 */

import java.util.*; 
import java.io.*;

class Function {  
  String ExOh(String str) { 
	  char[] myArray = str.toLowerCase().toCharArray();
	  int xCount = 0, oCount = 0;
	  for(int i = 0; i < str.length(); i++) {
		  if (myArray[i] == 'x') {
			  xCount++;
		  }
		  else if (myArray[i] == 'o') {
			  oCount++;
		  }
	  }
	  
	  if ( xCount == oCount){
		  str = "true";
	  }
	  else {
		  str = "false";
	  }
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ExOh(s.nextLine())); 
  }   
  
}
