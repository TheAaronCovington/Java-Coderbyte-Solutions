/*
 * Description: Using the Java language, have the function  ABCheck(str) take
 * the str parameter being passed and return the string true if the characters
 * a and b are separated by exactly 3 places anywhere in the string at least
 * once (ie. "lane borrowed" would result in true because there is exactly 
 * three characters between a and b). Otherwise return the string false. 
 */

import java.util.*; 
import java.io.*;

class Function {  
  String ABCheck(String str) { 
  char[] myArray = str.toLowerCase().toCharArray();

    for(int i = 0; i < str.length(); i++) {
    	if(((i+4 < str.length() && myArray[i+4] == 'b') && myArray[i] == 'a')) {
    		str = "true";
    		return str;
    	}
    	else if(((i+4 < str.length() && myArray[i+4] == 'a') && myArray[i] == 'b')) {
    		str = "true";
    		return str;
    	}
    }
    str = "false";
       
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ABCheck(s.nextLine()));
  }   
  
}
