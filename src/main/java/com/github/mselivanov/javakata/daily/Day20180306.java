package com.github.mselivanov.javakata.daily;

import java.util.function.Predicate;

import com.github.mselivanov.javakata.Katable;

public class Day20180306 implements Katable {
    public void kata() {
        Pair<String, String> pair1 = new Pair<>("Hello", "there");
        Pair<String, String> pair2 = new Pair<>("Hello", "there");
        Pair<String, String> pair3 = new Pair<>("Hello", "there!");
        Pair<Integer, String> pair4 = new Pair<>(100, "Outer space");
        Pair<Integer, String> pair5 = new Pair<>(100, "Outer space");        
        System.out.printf("Pair1 = %s\n", pair1);
        System.out.printf("Pair2 = %s\n", pair2);
        System.out.printf("Pair3 = %s\n", pair3);
        System.out.printf("Pair4 = %s\n", pair4);
        System.out.printf("Pair5 = %s\n", pair5);        
        System.out.printf("Pair1 == Pair2 %s\n", String.valueOf(pair1.equals(pair2)));
        System.out.printf("Pair1 == Pair3 %s\n", String.valueOf(pair1.equals(pair3)));
        System.out.printf("Pair1 == Pair4 %s\n", String.valueOf(pair1.equals(pair4)));
        System.out.printf("Pair4 == Pair5 %s\n", String.valueOf(pair4.equals(pair5)));
        System.out.printf("Is 'Reverever' case-insensitive palindrome: %s\n", PalindromeChecker.isPalindrome(PalindromeChecker.CASE_INSENSITIVE_PALINDROME_CHECKER, "Reverever"));
        System.out.printf("Is 'Reverever' case-sensitive palindrome: %s\n", PalindromeChecker.isPalindrome(PalindromeChecker.CASE_SENSITIVE_PALINDROME_CHECKER, "Reverever"));
        System.out.printf("Is 'reverever' case-sensitive palindrome: %s\n", PalindromeChecker.isPalindrome(PalindromeChecker.CASE_SENSITIVE_PALINDROME_CHECKER, "reverever"));
    }
    
    public void recallResult() {
    }
    
}

class Pair<E, T> {
    
    private E firstElement;
    private T secondElement;
    
    public Pair(E firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }
    
    public E getFirstElement() {
        return firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }
    
    @Override
    public boolean equals(Object aPair) {
        if(aPair == this) {
            return true;
        }
        
        if(!(aPair instanceof Pair)) {
            return false;
        }
        
        Pair p = (Pair)aPair;
        
        return getFirstElement().equals(p.getFirstElement()) && getSecondElement().equals(p.getSecondElement());
    }
    
    @Override
    public int hashCode() {
        int result = 17;
        result = result*31 + (getFirstElement() == null ? 0 : getFirstElement().hashCode());
        result = result*31 + (getSecondElement() == null ? 0 : getSecondElement().hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        E first = getFirstElement();
        T second = getSecondElement();
        String result = String.format("(First element = %s, Second element = %s)", 
            first == null ? "Null" : first.toString(), second == null ? "Null" : second.toString());
        return result;
    }    
}

class PalindromeChecker {
    public static boolean isPalindrome(Predicate<String> palindromeChecker, String value) {
        return palindromeChecker.test(value);
    }
      
    public static final Predicate<String> CASE_INSENSITIVE_PALINDROME_CHECKER = s -> new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
        
    public static final Predicate<String> CASE_SENSITIVE_PALINDROME_CHECKER = s -> new StringBuilder(s).reverse().toString().equals(s);
}
