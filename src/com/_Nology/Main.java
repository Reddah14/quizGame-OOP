package com._Nology;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // TODO: Add another player - Add timing (https://stackabuse.com/how-to-get-current-date-and-time-in-java/)
    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's you're name?");
        String playerName = myScanner.nextLine();
        System.out.println("Welcome to Fun with Capitals, " + playerName + " !");
        System.out.println("Every right answer will give you 10 points, and you will have 5 questions..");
        System.out.println("Good Luck ! ^^");

        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(getFirstQuestionWithAnswers());
        questions.add(getSecondQuestionWithAnswers());
        questions.add(getThirdQuestionWithAnswers());
        questions.add(getFourthQuestionWithAnswers());
        questions.add(getFifthQuestionWithAnswers());

        QuizGame player1game = new QuizGame(playerName, 0, questions);

        for (Question question : player1game.questions) // foreach
        {
            System.out.println(question.getDescriptionQuestion());
            for (Answer answer : question.answers) // foreach
            {
                System.out.println(answer.getCodeAnswer() + ") " + answer.getDescriptionAnswer());
            }
            System.out.println("Choose your answer!");
            String playerAnswer = myScanner.nextLine();

            while (!isValidAnswer(playerAnswer)) {
                System.out.println("Not a valid answer, select a correct option please!");
                playerAnswer = myScanner.nextLine();
            }

            if (isCorrectThisAnswer(playerAnswer, question.answers)) {
                player1game.addPlayerScore(10);
                System.out.println("Bravoooo, You got it right ! you accumulate 10 points!");
            } else {
                System.out.println("Oops.. you should study more geography! better luck next time ! :)");
            }
        }
        System.out.println("Well Done! Thank you very much for playing! your score is: " + player1game.getPlayerScore());
    }

    public static Boolean isValidAnswer(String selectedAnswer) {
        selectedAnswer = selectedAnswer.toLowerCase();
        if (!selectedAnswer.equals("a") && !selectedAnswer.equals("b") && !selectedAnswer.equals("c") && !selectedAnswer.equals("d")) {
            return false;
        } else {
            return true;
        }
    }

    public static Boolean isCorrectThisAnswer(String selectedCodeAnswer, ArrayList<Answer> answers) {
        answers.removeIf(answer -> !answer.codeAnswer.contains(selectedCodeAnswer));
        if (answers.get(0).getIsCorrect()) {
            return true;
        } else {
            return false;
        }
    }

    public static Question getFirstQuestionWithAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "San Juan", false));
        answers.add(createAnswer("b", "Asuncion", false));
        answers.add(createAnswer("c", "San Jose", true));
        answers.add(createAnswer("d", "Santiago", false));

        return createQuestion(0, "Capital city of Costa Rica ?", answers);
    }

    public static Question getSecondQuestionWithAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Seoul", false));
        answers.add(createAnswer("b", "Khartoum", false));
        answers.add(createAnswer("c", "Hanoi", true));
        answers.add(createAnswer("d", "Taipei", false));

        return createQuestion(0, "Capital city of Vietnam ?", answers);
    }

    public static Question getThirdQuestionWithAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Male", true));
        answers.add(createAnswer("b", "Maseru", false));
        answers.add(createAnswer("c", "Port Louis", false));
        answers.add(createAnswer("d", "chisinau", false));

        return createQuestion(0, "Capital city of Maldives ?", answers);
    }

    public static Question getFourthQuestionWithAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Muscat", false));
        answers.add(createAnswer("b", "Munich", false));
        answers.add(createAnswer("c", "Bucharest", true));
        answers.add(createAnswer("d", "Belgrade", false));

        return createQuestion(0, "Capital city of Romania ?", answers);
    }

    public static Question getFifthQuestionWithAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Brussels", false));
        answers.add(createAnswer("b", "Bern", true));
        answers.add(createAnswer("c", "San Marino", false));
        answers.add(createAnswer("d", "Tallin", true));

        return createQuestion(0, "Capital city of Switzerland ?", answers);
    }

    public static Question createQuestion(int id, String descriptionQuestion, ArrayList<Answer> answers) {
        return new Question(id, descriptionQuestion, answers);
    }

    public static Answer createAnswer(String codeAnswer, String descriptionAnswer, boolean isCorrect) {
        return new Answer(codeAnswer, descriptionAnswer, isCorrect);
    }
}

