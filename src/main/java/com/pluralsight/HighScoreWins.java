package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Home: Visitor |   21 :  9
        //  0       1        2    3     =  4

        System.out.print("Please enter a game score: ");
        String userInput = sc.nextLine();

        String[] parts = userInput.split("[:|]");// splits everything at once ---> Home:Visitor|21:9

        // parts [0] = "Home"
        // parts [1] = "Visitor"
        // parts [2] = "21"
        // parts [3] = "9"

        String home = parts[0];  // "Home"
        String visitor = parts[1];  // Visitor
        int homeScore = Integer.parseInt(parts[2]);   // 21
        int visitorScore = Integer.parseInt(parts[3]);  // 9


        if (homeScore > visitorScore){
            System.out.println("Winner: " + home);
        }
        else
            System.out.println("Winner: " + visitor);












    }
}
