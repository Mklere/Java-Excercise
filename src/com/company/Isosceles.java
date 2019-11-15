package com.company;
public class Isosceles {
    public void draw_a_isosceles(int number3) {
        for (int i = 1; i <= number3; i++) {
            for (int a = number3; a > i; --a) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}