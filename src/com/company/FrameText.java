package com.company;
public class FrameText {
    public void FrameSomeText() {
        // Edit this array to test out on a different input
        String[] inputs = {"Write","good","code","every","day"};
        System.out.print("*");
        int maxsize = 0;
        for (String s : inputs) {
            if (s.length() > maxsize) {
                maxsize = s.length();
            }
        }
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");     // first line of starts(top starts)
        }
        System.out.print("*");
        System.out.println();
        for (int j = 0; j < inputs.length; j++) {
            System.out.print("* " + inputs[j]);                        // start  with a * and a space before a word
            for (int i = inputs[j].length(); i <= maxsize-1; i++) {   //number of spaces after a word
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println(); // row for a word finished
        }System.out.print("*");
        //last line of starts (bottom stars)
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
    }
}