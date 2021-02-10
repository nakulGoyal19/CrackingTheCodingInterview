package main.java.ctci.arrays_and_strings_1.questions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author nakulgoyal
 *         10/02/21
 *         Given two strings, write a method to decide if one is a permutation to the other.
 */
public class CheckPermutation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String str2 = sc.nextLine();
        System.out.println("String one is a permutation to the other : " + checkPermutationUsingSort(str1, str2));
    }
    
    private static boolean checkPermutationUsingSort(String str1, String str2) {
        if (!Objects.equals(str1.length(), str2.length())) {
            return false;
        }
        str1 = sortString(str1);
        str2 = sortString(str2);
        return str1.equals(str2);
    }
    
    private static String sortString(String str) {
        
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
