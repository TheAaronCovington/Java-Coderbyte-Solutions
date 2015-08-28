/*
  DESCRIPTION: Tests if input is an anagram, returns true if it is, otherwise returns false.
*/
import java.util.Arrays;

public class Anagram {
    private static char[] string1, string2;

    public static boolean isAnagram(String str1, String str2){
        string1 = str1.toLowerCase().toCharArray();
        string2 = str2.toLowerCase().toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        return Arrays.equals(string1, string2);
    }

    public static void main(String[] args){
        System.out.println(Anagram.isAnagram("live", "evil"));
        System.out.println(Anagram.isAnagram("david", "dave"));
    }
}
