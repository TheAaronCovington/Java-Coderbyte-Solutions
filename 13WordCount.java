/*
 * Description: Using the Java language, have the function  WordCount(str)
 * take the str string parameter being passed and return the number of 
 * words the string contains (ie. "Never eat shredded wheat" would return 4).
 * Words will be separated by single spaces. 
 */

import java.util.*; 
import java.io.*;

class Function {  
  String WordCount(String str) { 
	  char[] myArray = str.toCharArray();
	  Integer count = 1;
    
	  for(int i = 1; i < str.length(); i++) {
		  if (myArray[i] == ' ' && i+1 != str.length()){
    		count++;
		  }
	  }
       str = count.toString();
       
       return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.WordCount(s.nextLine())); 
  }   
  
}
