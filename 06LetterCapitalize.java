import java.util.*; 
import java.io.*;

class Function {  
  String LetterCapitalize(String str) { 
    StringBuffer output = new StringBuffer();
    for(int i = 0; i < str.length(); i++) {
      if (i == 0) {
    	  output.append(str.toUpperCase().charAt(i)); 
      }
      else if (str.charAt(i) == ' ' && i+1 != str.length()) {
    	  output.append(str.charAt(i));
    	  i++;
    	  output.append(str.toUpperCase().charAt(i)); 
      }
      else {
    	  output.append(str.charAt(i));
      }
    	
    }
    str = output.toString();
       
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterCapitalize(s.nextLine()));  
  }   
  
} 
