package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
Quotation marks are often used to denote the start and end of a string.
But sometimes we need to print out the quotation marks themselves by using escape characters.
Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.

Example Output
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints
Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise.
Use string concatenation instead.
 */

import java.util.Scanner;

public class PrintingQuotes
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        String MyQuote = getQuote(in);

        String MyAuthor = getAuthor(in);

        print(MyQuote, MyAuthor);
    }

    private static String getAuthor(Scanner in) {
        System.out.println("Who said it? ");

        return in.nextLine();
    }

    private static String getQuote(Scanner in) {
        System.out.println( "What is the quote? " );

        return in.nextLine();
    }

    private static void print(String MyQuote, String MyAuthor) {
        System.out.println(MyAuthor + " says, " + "\"" + MyQuote +"\"");
    }

}
