//  Check a String is Palindrome or not :- Palindrome is that word that is same as when you read from back which is same word as normal word ex- noon, madam, racecar

import java.util.*;
public class PalindromeCheck{
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){

                // for not a Palindrome.
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        // String str = "racecar";
        // String str = "noon";
        String str = "asad";
        System.out.println(isPalindrome(str));
    }
}