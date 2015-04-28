/*
Problem Description: Using the Java language, have the function FirstFactorial(num) take the num parameter 
being passed and return the factorial of it (ie. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, 
the range will be between 1 and 18. 
*/

import java.util.*; 
import java.io.*;

class Function {  
  int FirstFactorial(int num) { 
  
    int count = num - 1;
    while (count > 0) {
    	num = num * count;
      	count--;
    }
       
    return num;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstFactorial(s.nextLine())); 
  }   
  
}   
