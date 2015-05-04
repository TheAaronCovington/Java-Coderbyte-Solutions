/*
 * Description: Using the Java language, have the function  AlphabetSoup(str)
 * take the str string parameter being passed and return the string with the 
 * letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and 
 * punctuation symbols will not be included in the string.  
 */

import java.util.*; 
import java.io.*;

class Function {  

  String AlphabetSoup(String str) { 
  
	  char[] myArray = str.toCharArray();
	  Arrays.sort(myArray);
	  str = String.valueOf(myArray);

    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.AlphabetSoup(s.nextLine())); 
  }   
  
}
