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
        Score myScore = new Score(0);

        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(getFirstQuestionAnswers());
        questions.add(getSecondQuestionAnswers());
        questions.add(getThirdQuestionAnswers());
        questions.add(getFourthQuestionAnswers());
        questions.add(getFifthQuestionAnswers());

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

            if (isCorrectThisAnswer(playerAnswer, question.answers)) {
                player1game.addPlayerScore(10);
                System.out.println("Bravoooo, You got it right ! you accumulate 10 points!");
            } else {
                System.out.println("Oops, you should study more geo!! better luck next time!");
            }
        }
        System.out.println("Finished! Thank you very much for playing! your score is: " + player1game.getPlayerScore());
    }

    public static Boolean isCorrectThisAnswer(String selectedCodeAnswer, ArrayList<Answer> answers) {
        answers.removeIf(answer -> !answer.codeAnswer.contains(selectedCodeAnswer));
        if (answers.get(0).getIsCorrect()) {
            return true;
        } else {
            return false;
        }
    }

    public static Question getFirstQuestionAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Paris", true));
        answers.add(createAnswer("b", "Madrid", false));
        answers.add(createAnswer("c", "London", false));
        answers.add(createAnswer("d", "Malaga", false));

        return createQuestion(0, "Capital city of France ?", answers);
    }

    public static Question getSecondQuestionAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Brussels", false));
        answers.add(createAnswer("b", "Madrid", false));
        answers.add(createAnswer("c", "Sidney", true));
        answers.add(createAnswer("d", "Malaga", false));

        return createQuestion(0, "Capital city of Australia ?", answers);
    }

    public static Question getThirdQuestionAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Paris", false));
        answers.add(createAnswer("b", "Madrid", true));
        answers.add(createAnswer("c", "London", false));
        answers.add(createAnswer("d", "Malaga", false));

        return createQuestion(0, "Capital city of Spain ?", answers);
    }

    public static Question getFourthQuestionAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Berlin", true));
        answers.add(createAnswer("b", "Munich", false));
        answers.add(createAnswer("c", "London", false));
        answers.add(createAnswer("d", "Malaga", false));

        return createQuestion(0, "Capital city of Germany ?", answers);
    }

    public static Question getFifthQuestionAnswers() {
        ArrayList<Answer> answers = new ArrayList<Answer>();
        answers.add(createAnswer("a", "Paris", false));
        answers.add(createAnswer("b", "Madrid", false));
        answers.add(createAnswer("c", "Oporto", false));
        answers.add(createAnswer("d", "Lisboa", true));

        return createQuestion(0, "Capital city of Portugal ?", answers);
    }

    public static Question createQuestion(int id, String descriptionQuestion, ArrayList<Answer> answers) {
        return new Question(id, descriptionQuestion, answers);
    }

    public static Answer createAnswer(String codeAnswer, String descriptionAnswer, boolean isCorrect) {
        return new Answer(codeAnswer, descriptionAnswer, isCorrect);
    }
}

