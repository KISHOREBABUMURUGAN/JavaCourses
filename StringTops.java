package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringTops {


	// Method to reverse a string
	    static String Reverse(String str) {
	        String reverse = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }
	        return reverse;
	    }

	    // Method to count vowels in a string
	    static void countVowels(String input) {
	        input = input.toLowerCase();
	        int count = 0;

	        for (int i = 0; i <= input.length() - 1; i++) {
	            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
	                input.charAt(i) == 'i' || input.charAt(i) == 'o' ||
	                input.charAt(i) == 'u') {
	                count++;
	            }
	        }

	        System.out.println("Vowels count: " + count);
	    }

	    // Method to count occurrences of "bb" in a string
	    static int countSubStringCount(String s1) {
	        int count = 0;
	        for (int i = 0; i < s1.length() - 1; i++) {
	            if (s1.charAt(i) == 'b' && s1.charAt(i + 1) == 'b') {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	 // Method to count duplicate characters in a string
	    static void countDuplicateCharacter(String s1) {
            int count = 0;

            for (int i = 0; i < s1.length(); i++) {
                for (int j = i + 1; j < s1.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        count++; 
                        break;// Avoid counting the same character multiple times
                    }
                }
            }

            System.out.println("Duplicate character count: " + count);
	    }
	    
	    //add 2 list of string
	    static void twoListOfString() {
	    	List<String>l1 =new ArrayList<>();
	    	l1.add("kishore");
	    	
	    	List<String>l2 =new ArrayList<>();
	    	l2.add("babu");
	    	
	    	l1.addAll(l2);
	    	
	    	System.out.println(l1);
	    }
	    
	    //Method to coundt duplicate string\
	    
	    static void duplicateStringCountswithIters() {
	    	String iter="kishorebabukishore";
	    	
	    	char[] chararray=iter.toCharArray();
	    	Map<Character, Integer> hashmap=new HashMap<>();
	    	for(char ch:chararray ) {
	    		if(hashmap.containsKey(ch)) {
	    			hashmap.put(ch, hashmap.get(ch)+1);
	    		}
	    		else {
	    			hashmap.put(ch, 1);
	    		}
	    	}
	    	for(Map.Entry<Character, Integer> entry:hashmap.entrySet()) {
	    		if(entry.getValue()>1) {
	    			System.out.println(entry.getKey()+ " "+entry.getValue());
	    		}
	    	}
	    	
	    	
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Test the methods
	        System.out.println("Reversed: " + Reverse("Kishore"));
	        countVowels("KISHOREBABUAEIOUA");
	        System.out.println("Count of 'bb': " + countSubStringCount("abcbbcabbcab"));
	        countDuplicateCharacter("kishorekis");

	        twoListOfString();
duplicateStringCountswithIters();
	    }


}
