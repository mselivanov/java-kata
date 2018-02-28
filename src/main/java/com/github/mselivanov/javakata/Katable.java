package com.github.mselivanov.javakata;

public interface Katable {
    void kata();
    
    default void recallResult() {
        System.out.println("No results at all");
    }
}