import java.util.*; 
import java.io.*;

class Function {  
  String LongestWord(String sen) { 
	  int count = 0;
	  String largest = "";
	  //gets rid of non alphanumeric characters and splits words separated by space into separate strings
	  String[] alter = sen.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
	  for (int i = 0; i < alter.length; i++) {
		  if(alter[i].length() > largest.length()) {
			  largest = alter[i];
		  }
	  }
	  sen = largest;
    return sen;  
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LongestWord(s.nextLine()));
  }   
  
}
