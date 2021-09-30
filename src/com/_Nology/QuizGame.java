package com._Nology;

import java.util.ArrayList;

public class QuizGame {
    String playerName;
    ArrayList<Question> questions;

    public QuizGame(String playerName, ArrayList<Question> questions) {
        this.playerName = playerName;
        this.questions = questions;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
