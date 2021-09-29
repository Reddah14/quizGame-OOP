package com._Nology;

public class Game {
    String playerName;
    Question questionList;

    public Game(String playerName, Question questionList) {
        this.playerName = playerName;
        this.questionList = questionList;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Question getQuestionList() {
        return questionList;
    }

    public void setQuestionList(Question questionList) {
        this.questionList = questionList;
    }
}
