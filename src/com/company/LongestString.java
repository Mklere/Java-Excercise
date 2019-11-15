package com.company;
public class LongestString {
    public static void Longest_string(String[] Longest) {
        String LongestString = Longest[0];
        for (int i = 1; i < Longest.length; i++) {
            if (Longest[i].length() > LongestString.length()) {
                LongestString = Longest[i];
            }
        }

        for (int j = 0; j < Longest.length; j++) {
            if (Longest[j].length() == LongestString.length()) {
                System.out.println(Longest[j]);
            }
        }


    }
}
