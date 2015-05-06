/*
 * Description: Using the Java language, have the function LetterCountI(str) take the
 * str parameter being passed and return the first word with the greatest number of 
 * repeated letters. For example: "Today, is the greatest day ever!" should return
 * greatest because it has 2 e's (and 2 t's) and it comes before ever which also 
 * has 2 e's. If there are no words with repeating letters return -1. Words will 
 * be separated by spaces. 
 */
import java.util.*; 
import java.io.*;

class Function {  
  String LetterCountI(String str) { 
  int count = 0, temp = 0;
  String[] wordList = str.split(" ");
  String word = wordList[0];
  
  for(int i = 0; i < wordList.length; i++) {
	 for(int j = 0; j < wordList[i].length(); j++) {
		 temp = 0;
		 for(int k = 0; k < wordList[i].length(); k++) {
			 if(wordList[i].charAt(j) == wordList[i].charAt(k)) {
				 temp++;
			 }
		 }
		 if(count < temp) {
			 count = temp;
			 word = wordList[i];
			 temp = 0;
		 }
	 }
  }
  	if(count == 1){
  		return "-1";
  	}
  str = word;
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterCountI(s.nextLine()));  
  }   
  
}
