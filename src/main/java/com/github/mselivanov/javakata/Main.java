package com.github.mselivanov.javakata;

import com.github.mselivanov.javakata.daily.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {    
    
    public static final String KATA_PACKAGE = "com.github.mselivanov.javakata.daily.";
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        
        String className = KATA_PACKAGE + "Day" + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE).replace("-", "");
        Class cl = Class.forName(className);        
        Katable k = (Katable)cl.newInstance();
        k.kata();
    }
}