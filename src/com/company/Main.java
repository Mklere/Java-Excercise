package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);

        Hello obj = new Hello();
        System.out.println("Enter your name");
        String name;
        name=scan.nextLine();
        obj.Hello(name);

        EvenOdd obj2 = new EvenOdd();
        System.out.println("Enter a number");
        int number= scan.nextInt();
        obj2.even_or_odd(number);

        Square obj3 = new Square();
        System.out.println("Enter a Square number");
        int number1 = scan.nextInt();
        obj3.draw_a_square(number1);

        Triangle obj4 = new Triangle();
        System.out.println("Enter a Triangle number");
        int number2 = scan.nextInt();
        obj4.draw_a_triangle(number2);

        Isosceles obj5 = new Isosceles();
        System.out.println("Enter a Isosceles number");
        int number3 = scan.nextInt();
        obj5.draw_a_isosceles(number3);


        String[] Longest = {"the", "quick", "brown", "fox", "ate", "my", "chickens", "knuckles"};
        LongestString.Longest_string(Longest);


        int LongestString[][] ={{11,22,33} ,{1,2,3}};
        CombineTwoArrays.Combine_2_Arrays(LongestString);
    }
}
