package com._Nology;

public class Answer {
    String descriptionAnswer;
    boolean isCorrect;

    public Answer(String descriptionAnswer, boolean isCorrect) {
        this.descriptionAnswer = descriptionAnswer;
        this.isCorrect = isCorrect;
    }

    public String getDescriptionAnswer() {
        return descriptionAnswer;
    }

    public void setDescriptionAnswer(String descriptionAnswer) {
        this.descriptionAnswer = descriptionAnswer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
