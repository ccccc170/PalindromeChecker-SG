# Palindrome Checker

## Project overview:

This programme checks words and sentences inputted by 
a user and returns true or false in response to 
whether the entered input is a palindrome. The 
checkPalindrome function ignores any spaces, case, 
numbers and special characters, focusing only on the 
letters in the order that they come. The programme's 
features have been tested using JUnit.

## The checking function:

The function that checks whether the input in a 
palindrome is called checkPalindrome and can be found 
in the PalindromeChecker class. The checkPalindrome 
method takes in a string and initially checks for an 
empty string, outputting false if this is the case. It 
then initialises two new strings newString and 
reverseString both with a value of an empty string. It 
then uses a for loop to iterate over the passed in 
string, starting at the first (0) index. The logic 
inside the loop uses the isLetter character method 
to determine whether the character at each point in 
the string is a letter. If a character is determined 
to be a letter, then this character is added to 
newString. This ensures that newString is built up 
from characters of the passed in string that are 
letters, hence not including any special characters, 
number characters or space. So newString is built up 
of the only required characters to check, kept in the 
correct order as they appear within the passed in 
string.

Another for loop is initialised which employs very 
similar logic. This loop however starts at the final 
index of the passed in string, again checking that 
each character is a letter. Each character that is 
determined to be a letter is then added to 
reverseString in the opposite order that they are 
in within the passed in string. After both loops have 
completed their cycle, we now have two strings that 
the programme can compare to check for a palindrome. 
There is newString that is in the same order as the 
passed in string excluding any characters that are 
not letters, and reverseString which is the same but 
in reverse order.

A simple if statement is then used where the condition 
checks whether newString and reverseString are equal 
using the equalsIgnoreCase method so that the case 
of the characters does not matter. If both strings 
are equal, this means they must be a palindrome and 
true is returned, otherwise, the function returns 
false.

## How to run the programme:

The main method calls the start method within the 
Starter class which asks for user input 
(specifically a word or a sentence). This input is 
then send to the checkPalindrome function within the 
PalindromeChecker class. This function responds with 
true or false regarding whether the entered input is 
a palindrome. The returned boolean is then printed 
in the console. The user is also told to enter 
"quit" if they wish to exit the programme.

