/*
Description: Using the Java language, have the function TimeConvert(num) take the 
num parameter being passed and return the number of hours and minutes the parameter 
converts to (ie. if num = 63 then the output should be 1:3). Separate the number of
hours and minutes with a colon. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String TimeConvert(int num) { 
  
	  int hours = num/60;
	  int minutes = num%60;
	  String output = hours + ":" + minutes;
    
       
    return output;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.TimeConvert(s.nextLine()));
  }   
  
}
