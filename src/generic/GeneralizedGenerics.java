package generic;

import java.util.Arrays;
import java.util.List;

public class GeneralizedGenerics {

    public static boolean isPalindrome(CharSequence s) {
        System.out.println("Testing: " + s);
        return s.length() < 2
                || ((s.charAt(0) == s.charAt(s.length() - 1))
                && (isPalindrome(s.subSequence(1, s.length() - 1))));
    }

    public static void buildCSList(List<? super CharSequence> l) {
        CharSequence cs = "Hello";
        l.add(cs);
//        for (CharSequence cs : l) { // not allowed for ? super CharSequence
//            
//        }
    }
    
    public static boolean arePalindromes(List<? extends CharSequence> strings) {
//        strings.add(""); // not allowed for ? extends CharSequence
        for (CharSequence s : strings) {
            if (!isPalindrome(s)) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePalindromes(CharSequence[] strings) {
        for (CharSequence s : strings) {
            if (!isPalindrome(s)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("\"\" is palindrome? " + isPalindrome(""));
        System.out.println("\"a\" is palindrome? " + isPalindrome("a"));
        System.out.println("\"aa\" is palindrome? " + isPalindrome("aa"));
        System.out.println("\"aba\" is palindrome? " + isPalindrome("aba"));
        System.out.println("\"abba\" is palindrome? " + isPalindrome("abba"));
        System.out.println("\"abcba\" is palindrome? " + isPalindrome("abcba"));
        System.out.println("\"abacab\" is palindrome? " + isPalindrome(new StringBuilder("abacab")));

        List<String> ls = Arrays.asList(new String[]{
            "aba", "abcdedcba"
        });
        System.out.println("arePalindromes? " + arePalindromes(ls));
        
        System.out.println("arePalindromes? " + arePalindromes(new String[] {"aba", "abcdedcba"}));
    }
}
