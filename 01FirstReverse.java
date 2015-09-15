/*
Problem Description: Using the Java language, have the function FirstReverse(str) take the str parameter 
being passed and return the string in reversed order. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String FirstReverse(String str) { 
		StringBuffer myString = new StringBuffer(str.length());
		int length = str.length()-1;
		
		for (int i = 0; i < str.length(); i++) {
			myString.append(str.charAt(length));
			length--;
		}
		str = myString.toString();
		
    return str;
    
  }
  
  /**********ALTERNATE SOLUTION*********/
  
  String FirstReverse(String str) { 
  
    String myString = "";
    for(int i = 0; i <  str.length(); i++){
    	myString = str.charAt(i) + myString;	
    }
    return myString;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstReverse(s.nextLine()));
  }   
  
}  
