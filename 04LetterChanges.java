/*
 * Description: Using the Java language, have the function LetterChanges(str) take 
 * the str parameter being passed and modify it using the following algorithm. Replace
 * every letter in the string with the letter following it in the alphabet 
 * (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string 
 * (a, e, i, o, u) and finally return this modified string. 
 */

import java.util.*; 
import java.io.*;

class Function {  
  String LetterChanges(String str) { 
  
    char[] myArray = new char[str.length()];
    str.getChars(0, str.length(), myArray, 0); //convert string to char array
    
    for(int i = 0; i < myArray.length; i++) {
    	if (Character.isLetter(myArray[i])== false) { //if not a letter skip iteration
    		continue;
    	}
    	else if (myArray[i] == 'z') { 
    		myArray[i] = 'a'; //if z set = to a
    		continue;
    	}
    	else if (myArray[i] == 'Z') {
    		myArray[i] = 'A'; //if Z set = to A
    		continue;
    	}
    	myArray[i]++; //increment to next letter
    }
    str = String.valueOf(myArray); //convert char array back to a string
    //Replace all vowels with capital letters
    str = str.replaceAll("a", "A").replaceAll("e","E").replaceAll("i","I").
    replaceAll("o", "O").replaceAll("u", "U");
    
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterChanges(s.nextLine()));
  }   
  
}
