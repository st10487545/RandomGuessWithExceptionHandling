/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomguesswithexceptionhandling;

/**
 *
 * @author emeris
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomGuessWithExceptionHandling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != numberToGuess) {

            try {
                System.out.print("Enter your guess: ");

                guess = input.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } 
                else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } 
                else {
                    System.out.println("Correct!");
                    System.out.println("It took you " + attempts + " attempts.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input! Please enter an integer.");
                input.nextLine();
            }
        }

        input.close();
    }
}
