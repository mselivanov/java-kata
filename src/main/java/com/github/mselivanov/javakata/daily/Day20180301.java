package com.github.mselivanov.javakata.daily;

import java.util.Arrays;

import com.github.mselivanov.javakata.Katable;

public class Day20180301 implements Katable {
    
    public void kata() {
        System.out.println("---------- String constructors ----------");
        String s1 = "First string";
        String s2 = new String("Second string");
        StringBuilder sb1 = new StringBuilder("Third string");
        String s3 = new String(sb1);
        byte[] strBytes = {0x46, 0x6f, 0x72, 0x74, 0x68, 0x20, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67};
        String s4 = new String(strBytes);
        System.out.printf("\tString s1 = \"First string\";\n");
        System.out.printf("\ts1 = %s\n", s1);
        System.out.printf("String s2 = new String(\"Second string\");\n");
        System.out.printf("\ts2 = %s\n", s2);
        System.out.printf("String s3 = new String(sb1);\n");
        System.out.printf("\ts3 = %s\n", s3);
        System.out.printf("String s4 = new String({0x46, 0x6f, 0x72, 0x74, 0x68, 0x20, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67});\n");
        System.out.printf("\ts4 = %s\n", s4);
        
        
        System.out.println("---------- String methods ----------");
        System.out.printf("\ts1.substring(6) = %s\n", s1.substring(6));
        System.out.printf("\ts1.length() = %s\n", s1.length());
        System.out.printf("\ts1.charAt(0) = %s\n", s1.charAt(0));
        String[] splittedStr = s1.split(" ");
        System.out.printf("\ts1.split(\" \") = %s\n", Arrays.toString(splittedStr));
        System.out.printf("\ts1.startsWith(\"Fir\") = %s\n", s1.startsWith("Fir"));
        System.out.printf("\ts1.endsWith(\"ang\") = %s\n", s1.endsWith("ang"));
        System.out.printf("\ts1.contains(\"t s\") = %s\n", s1.contains("t s"));
        System.out.printf("\ts1.toUpperCase() = %s\n", s1.toUpperCase());
        System.out.printf("\ts1.toLowerCase() = %s\n", s1.toLowerCase());
        System.out.printf("\ts1.equalsIgnoreCase(\"FIRST string\") = %s\n", s1.equalsIgnoreCase("FIRST string"));
        System.out.printf("\ts1.replace(\"First\", \"Last\") = %s\n", s1.replace("First", "Last"));
        System.out.printf("\tString.valueOf(12) = %s\n", String.valueOf(12));
    }
    
    public void recallResult() {
        System.out.println("---------- Was good ---------- ");
        System.out.println("Recalled 4 String constructors");
        System.out.println("Recalled 12 String methods");
        
        System.out.println("---------- To improve ---------- ");
        System.out.println("Memorize more String constructors.");
        System.out.println("Memorize more String methods.");
    }

}

