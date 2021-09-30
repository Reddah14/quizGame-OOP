package com._Nology;

import java.util.ArrayList;

public class QuizGame {
    String playerName;
    int playerScore;
    ArrayList<Question> questions;

    public QuizGame(String playerName, int playerScore, ArrayList<Question> questions) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.questions = questions;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addPlayerScore(int playerScore) {
        this.playerScore += playerScore;
    }
}
