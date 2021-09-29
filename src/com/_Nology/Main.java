package com._Nology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's you're name?");
        String playerName = myScanner.nextLine();
        System.out.println("Welcome to Fun with Capitals, " + playerName);
        //Game newGame = new Game();

        Answer answer1_1 = new Answer("a", "Paris", true);
        Answer answer1_2 = new Answer("b", "Madrid", false);
        Answer answer1_3 = new Answer("c", "London", false);
        Answer answer1_4 = new Answer("d", "Malaga", false);

        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(answer1_1);
        answers.add(answer1_2);
        answers.add(answer1_3);
        answers.add(answer1_4);

        Question question1 = new Question(0, "Capital city of France ?", answers);
        System.out.println(question1.getDescriptionQuestion());

        for (Answer answer : answers) // foreach
        {
            System.out.println(answer.getCodeAnswer() + ") " + answer.getDescriptionAnswer());
        }
        System.out.println("Choose your answer!");
        String playerAnswer = myScanner.nextLine();
        System.out.println("Your chosen answer is: " + playerAnswer);
        answers.removeIf( answer -> !answer.codeAnswer.contains(playerAnswer));
        if (answers.get(0).getIsCorrect()) {
            System.out.println("You're champion!");
        } else {
            System.out.println("You Lose!");
        }
    }

//    public void generateListOfQuestions() {
//        Answer answers1_1 = new Answer("Paris", true);
//        Answer answers1_2 = new Answer("Madrid", false);
//        Answer answers1_3 = new Answer("London", false);
//        Answer answers1_4 = new Answer("Malaga", false);
//        Question question1 = new Question(0, "Capital city of France?", new Answer[]{answers1_1, answers1_2, answers1_3, answers1_4});
//    }
}