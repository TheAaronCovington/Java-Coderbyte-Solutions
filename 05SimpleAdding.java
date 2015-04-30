import java.util.*; 
import java.io.*;

class Function {  
  int SimpleAdding(int num) { 
  
    int temp = 0;
    for (int i = 1; i <= num; i++) {
      temp = temp + i;
    }
    num = temp;
       
    return num;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SimpleAdding(s.nextLine())); 
  }   
  
} 
