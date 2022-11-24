package com.test;

import com.sparta.PalindromeChecker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CheckPalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"pop", "racecar", "deified"})
    @DisplayName("Should return true when passed a lowercase palindrome with no spaces, numbers or special characters")
    public void PassedStandardLowerCasePalindrome(String string) {
        Boolean expectedResponse = true;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"MUM", "RACECAR", "DEIFIED"})
    @DisplayName("Should return true when passed an uppercase palindrome with no spaces, numbers or special characters")
    public void PassedStandardUpperCasePalindrome(String string) {
        Boolean expectedResponse = true;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pop", "racecaR", "dEifIEd"})
    @DisplayName("Should return true when passed a multi-case palindrome with no spaces, numbers or special characters")
    public void PassedMultiCasePalindrome(String string) {
        Boolean expectedResponse = true;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"p op", "DA D", "Race    car", " d ei  FIe d"})
    @DisplayName("Should return true when passed a palindrome with spaces, regardless of case")
    public void PassedPalindromeWithSpaces(String string) {
        Boolean expectedResponse = true;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pop7", "M8UM", "ra90CEcaR777", "d5E6iF88888ie89D"})
    @DisplayName("Should return true when passed a palindrome with numbers, regardless of case")
    public void PassedPalindromeWithNumbers(String string) {
        Boolean expectedResponse = true;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pop!", "'DAD", "R[]A{ce//Car", "d[[[--e---i..F,,IE\"d"})
    @DisplayName("Should return true when passed a palindrome with special characters, regardless of case")
    public void PassedPalindromeWithSpecialCharacters(String string) {
        Boolean expectedResponse = true;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"p  O{}-- P", "RA3452 =+ce  C67%$aR", "  D 9096&^% Ei--00f\"I ;;ed  7"})
    @DisplayName("Should return true when passed a palindrome with spaces, numbers and special characters, regardless of case")
    public void PassedPalindromeWithSpacesNumbersAndSpecialCharacters(String string) {
        Boolean expectedResponse = true;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"like", "YOGHURT", "TiMe", "PoLIcE"})
    @DisplayName("Should return false when passed non-palindromes with no spaces, numbers or special characters, regardless of case")
    public void PassedStandardNonePalindromeRegardlessOfCase(String string) {
        Boolean expectedResponse = false;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"lik e", "HAZ ARD", "BrOth  er", " SI  st E    R"})
    @DisplayName("Should return false when passed a non-palindromes with spaces, regardless of case")
    public void PassedNonePalindromeWithSpaces(String string) {
        Boolean expectedResponse = false;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"none7", "M8OTHER", "F66A78th55ER", "T90909ogeT67ER"})
    @DisplayName("Should return false when passed a palindrome with numbers, regardless of case")
    public void PassedNonePalindromeWithNumbers(String string) {
        Boolean expectedResponse = false;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"hi!", "'HELLO", "Gr[]e;;eTI''/Ng$s", "dI'.Ffe£@!rE]\"n**T"})
    @DisplayName("Should return false when passed a palindrome with special characters, regardless of case")
    public void PassedNonePalindromeWithSpecialCharacters(String string) {
        Boolean expectedResponse = false;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"w **76H  a66T", "Y%%    e   89s", "  H 896££5ell  ----0o "})
    @DisplayName("Should return false when passed a palindrome with spaces, numbers and special characters, regardless of case")
    public void PassedNonePalindromeWithSpacesNumbersAndSpecialCharacters(String string) {
        Boolean expectedResponse = false;
        Boolean result = PalindromeChecker.checkPalindrome(string);
        assertEquals(expectedResponse, result);
    }
}
