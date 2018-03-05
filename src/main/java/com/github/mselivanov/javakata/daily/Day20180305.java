package com.github.mselivanov.javakata.daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import com.github.mselivanov.javakata.Katable;

/**
* Class 
*/
public class Day20180305 implements Katable {
    private static final String[] phrases = {"Cheer up!", "7Up coming up!", null, "Bottoms up!", "Get down!", "What’s up?"};
    
    public void kata() {
        // Populate ArrayList from String array        
        List<String> phrasesList = new ArrayList<>(Arrays.asList(phrases));
        List<Predicate<String>> predicates = new ArrayList<>();
        predicates.add(s-> s!=null);
        predicates.add(s-> s!=null && s.toLowerCase().contains("up"));
        predicates.add(s -> {
            if(s == null) {
                return false;
            }
            char firstChar = s.toLowerCase().charAt(0);
            return firstChar >= 'a' && firstChar <= 'z';
        });        
        applyPredicates(phrasesList, predicates);
    }
    
    /**
     * @return true if String satisfies all the predicates, false otherwise
     */
    public static boolean andPredicates(String str, List<Predicate<String>> predicates) {
        return Day20180305.<String>andPredicatesGeneric(str, predicates);
    }
    
    public static <T> boolean andPredicatesGeneric(T value, List<Predicate<T>> predicates) {
        for(Predicate<T> predicate: predicates){
            if(!predicate.test(value)) {
                return false;
            }
        }
        return true;
    }
    
    public static List<String> applyPredicates(List<String> values, List<Predicate<String>> predicates) {
        return Day20180305.<String>applyPredicatesGeneric(values, predicates);
    }
    
    /**
     * 
     */
    public static <T> List<T> applyPredicatesGeneric(List<T> values, List<Predicate<T>> predicates) {
        List<T> filteredValues = new ArrayList<>();
        for(T value: values) {
            if(Day20180305.<T>andPredicatesGeneric(value, predicates)){
                filteredValues.add(value);
            }
        }
        System.out.printf("Remained values: %s\n", filteredValues.toString());
        return filteredValues;
    }
    
    public void recallResult() {
    }
    
}
