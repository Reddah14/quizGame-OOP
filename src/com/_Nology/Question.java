package com._Nology;

public class Question {
    int id;
    String descriptionQuestion;
    Answer[] answers;

    public Question(int id, String descriptionQuestion, Answer[] answers) {
        this.id = id;
        this.descriptionQuestion = descriptionQuestion;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptionQuestion() {
        return descriptionQuestion;
    }

    public void setDescriptionQuestion(String descriptionQuestion) {
        this.descriptionQuestion = descriptionQuestion;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
}
