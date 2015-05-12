/*
 * Description:  Using the Java language, have the function 
 * DivisionStringified(num1,num2) take both parameters being passed, divide
 * num1 by num2, and return the result as a string with properly formatted
 * commas. If an answer is only 3 digits long, return the number with no
 * commas (ie. 2 / 3 should output "1"). For example: if num1 is 
 * 123456789 and num2 is 10000 the output should be "12,345". 
 */
import java.util.*; 
import java.io.*;

class Function {  
  String DivisionStringified(int num1, int num2) { 
	  Integer result = (int)Math.round(num1/(double)num2);
	  String[] str = result.toString().split("");
	  int count = 0;
	  for(int i = str.length-2; i >= 0; i--){
		  count++;
		  if(count % 3 == 0){
			  str[i] = str[i] + ",";
			  count=0;
		  }
	  }
	  String output = "";
	  for(int i = 0; i < str.length; i++){
		  output = output + str[i];
	  }
    return output;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.DivisionStringified(s.nextLine())); 
  }   
  
}
