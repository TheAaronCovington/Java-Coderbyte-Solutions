/*
 * Description: Using the Java language, have the function  Palindrome(str) 
 * take the str parameter being passed and return the string true if the 
 * parameter is a palindrome, (the string is the same forward as it is backward)
 * otherwise return the string false. For example: "racecar" is also "racecar"
 * backwards. Punctuation and numbers will not be part of the string.  
 */

import java.util.*; 
import java.io.*;

class Function {  
  String Palindrome(String str) { 
	  str = str.replaceAll(" ", "");
	  StringBuffer output = new StringBuffer();
	  int countdown = str.length()-1;
	  for(int i = 0; i < str.length(); i++) {
		  if(Character.isLetter(str.charAt(i))){
		  output.append(str.charAt(countdown));
		  }
		  countdown--;
	  }
	  String reversed = output.toString();
	  if (reversed.equals(str)) {
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
    System.out.print(c.Palindrome(s.nextLine()));
  }   
  
}
