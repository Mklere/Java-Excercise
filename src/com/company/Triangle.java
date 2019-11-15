package com.company;
public class Triangle {

    public void draw_a_triangle(int number2){
        for( int i = 1; i <= number2; i++)
        {
            for (int a = 1; a<=i; a++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
