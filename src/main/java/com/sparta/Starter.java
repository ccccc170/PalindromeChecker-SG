package com.sparta;

import java.util.Scanner;

public class Starter {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("quit")) {
            System.out.println("Please enter a word or sentence. Type quit to exit (quit is not a palindrome).");
            userInput = scanner.nextLine();
            if (!userInput.equals("quit")) {
                System.out.println(PalindromeChecker.checkPalindrome(userInput));
            }
        }
    }
}
