package com.sparta;

public class PalindromeChecker {
    public static boolean checkPalindrome(String string) {
        if (string.equals("")) {
            return false;
        }

        String newString = "";
        String reverseString = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                newString = newString + string.charAt(i);
            }
        }

        for (int i = string.length() - 1; i >= 0; i--) {
            if (Character.isLetter(string.charAt(i))) {
                reverseString = reverseString + string.charAt(i);
            }
        }

        if (newString.equalsIgnoreCase(reverseString)) {
            return true;
        } else {
            return false;
        }
    }


}
