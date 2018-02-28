package com.github.mselivanov.javakata.daily;

import java.util.Arrays;

import com.github.mselivanov.javakata.Katable;

public class Day20180228 implements Katable {
    public void recallResult() {
        System.out.println("---------- Was good ---------- ");
        System.out.println("Recalled 3 String constructors");
        System.out.println("Recalled 3 CharSequence methods");
        System.out.println("Recalled 5 String methods");
        System.out.println("Recalled 3 StringBuilder constructors");
        System.out.println("Recalled 5 StringBuilder methods");
        
        System.out.println("---------- To improve ---------- ");
        System.out.println("Memorize StringBuilder constructors.");
        System.out.println("Memorize different flavours of StringBuilder append method.");
        System.out.println("Memorize StringBuilder indexOf, lastIndexOf, replace, reverse, setCharAt, deleteCharAt, trimToSize, substring methods");
        System.out.println("Memorize String constructors (from StringBuilder, byte, char, int arrays).");
        System.out.println("Memorize different String methods.");
    }
    public void kata() {
        System.out.println("String and StringBuilder Kata");
        System.out.println("String construction");
        String s1 = "First string";
        String s2 = new String("Second string");
        String s3 = new String(s1);
        String sSummary = String.format("String construction summary: s1 = %s s2 = %s s3 = %s", s1, s2, s3);
        System.out.println("CharSequence methods");
        CharSequence cs = (CharSequence)s1;
        System.out.printf("CharSequence cs = \"%s\"\ncs.length() = %d\ncs.charAt(1) = %s\ncs.subSequence(0, 3) = %s\n", cs, cs.length(), cs.charAt(1), cs.subSequence(0, 3));
        System.out.println("String methods");
        System.out.printf("String s1 = \"%s\"\ns1.replace(\"First\", \"Firstly\")=%s\n", s1, s1.replace("First", "Firstly"));
        System.out.printf("String[] sArr = s1.split(\" \");\n");
        String[] sArr = s1.split(" ");
        System.out.printf("sArr = %s;\n", Arrays.toString(sArr));
        System.out.printf("String.valueOf(12) = %s\n", String.valueOf(12));
        System.out.printf("s1.indexOf(\"i\") = %d\n", s1.indexOf("i"));
        System.out.printf("s1.lastIndexOf(\"i\") = %d\n", s1.lastIndexOf("i"));
        System.out.printf("s1.concat(\" and that's it\") = %s\n", s1.concat(" and that's it"));
        
        System.out.println("StringBuilder construction");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Construction from string");
        // From CharSequence
        StringBuilder sb3 = new StringBuilder(cs);
        // From CharSequence (subsequence)
        StringBuilder sb4 = new StringBuilder(64);

        
        System.out.printf("StringBuilder sb1 = new StringBuilder(); = %s\n", sb1);
        System.out.printf("StringBuilder sb2 = new StringBuilder(\"Construction from string\"); = %s\n", sb2);
        System.out.printf("StringBuilder sb3 = new StringBuilder(cs); = %s\n", sb3);
        System.out.printf("StringBuilder sb4 = new StringBuilder(64); = %s\n", sb4);
        sb2.append(" Cool!");
        System.out.printf("sb2.append(\" Cool!\") = %s\n", sb2);
        sb3.insert(5, " and only");
        System.out.printf("sb3.insert(5, \" and only\") = %s\n", sb3);
        sb4.append("StringBuilder with cool capacity");
        System.out.printf("sb4.append(\"StringBuilder with cool capacity\"); = %s\n", sb4);
        sb4.delete(0, 6);
        System.out.printf("sb4.delete(0, 6); = %s\n", sb4);
        System.out.printf("sb4.capacity(); = %d\n", sb4.capacity());
        sb4.setLength(7);
        System.out.printf("After sb4.setLength(7); = %s\n", sb4);
    }
}