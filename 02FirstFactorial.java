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
