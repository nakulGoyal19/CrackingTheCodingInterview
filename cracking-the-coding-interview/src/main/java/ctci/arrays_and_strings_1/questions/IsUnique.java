package main.java.ctci.arrays_and_strings_1.questions;

import java.util.Scanner;

/**
 * @author nakulgoyal
 *         10/02/21
 */

/* Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class IsUnique {
    
    public static final int ASCII_SIZE = 128;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = sc.nextLine();
        System.out.println("Input is Unique : " + checkAllCharactersAreUniqueUsingHashTable(input));
    }
    
    // using hash table
    // assume input is ASCII i.e. 128 characters
    // time O(n) or O(1) as it will be max 128.
    // space O(1) i.e. 128*boolean_size
    public static Boolean checkAllCharactersAreUniqueUsingHashTable(String input) {
        if (input.length() > ASCII_SIZE) {
            return false;
        }
        boolean[] char_set = new boolean[ASCII_SIZE];
        for (int i = 0; i < input.length(); i++) {
            int char_val = input.charAt(i);
            if (char_set[char_val]) {
                return false;
            }
            char_set[char_val] = true;
        }
        return true;
    }
}
