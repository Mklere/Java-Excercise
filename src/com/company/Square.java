package com.company;
public class Square {
    public void draw_a_square(int number1){
        for( int i = 1; i <= number1; i++)
        {
            for (int a = 1; a<= number1; a++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
