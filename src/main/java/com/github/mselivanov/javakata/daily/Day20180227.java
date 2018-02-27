package com.github.mselivanov.javakata.daily;

import com.github.mselivanov.javakata.Katable;

public class Day20180227 implements Katable {
    
    public void kata() {
        String s = "Example string";
        String s1 = new String(s);
        String sNew = s1.replace("E", "e");
        String output = String.format("s1 = %s \nsNew = %s", s1, sNew);
        System.out.println(output);
    }
    
}