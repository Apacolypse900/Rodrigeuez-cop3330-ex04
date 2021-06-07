package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a noun: ");
            String Noun = myObj.nextLine();

        System.out.print("Enter a verb: ");
            String Verb = myObj.nextLine();

        System.out.print("Enter an adjective: ");
            String Adjective = myObj.nextLine();

        System.out.print("Enter an adverb: ");
            String Adverb = myObj.nextLine();

        System.out.print("Do you " + Verb + " your " + Adjective + " " + Noun + " " + Adverb  + "? That's Hilarious!");
    }
}
