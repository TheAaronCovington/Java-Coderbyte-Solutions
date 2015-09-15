/*
Problem Description: Using the Java language, have the function FirstFactorial(num) take the num parameter 
being passed and return the factorial of it (ie. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, 
the range will be between 1 and 18. 
*/

import java.util.*; 
import java.io.*;

class Function {  
  int FirstFactorial(int num) { 
		int N = num;
		for(int i = 1; i < N; i++){
			num = num * i;
		}
		return num;
	}
  
  //RECURSIVE SOLUTION
   int FirstFactorial(int num) { 
    if(num == 0){
    	return 1;
    }
    return num * FirstFactorial(num - 1);
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstFactorial(s.nextLine())); 
  }   
  
}   
