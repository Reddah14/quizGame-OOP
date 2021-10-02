package com._Nology_test;

import com._Nology.Answer;
import com._Nology.Question;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Question_test {
    @Test
    public void creatingQuestionSetsProperlyDescriptionQuestion() {
        // Arrange
        String descriptionQuestion = "Capital city of Spain";
        Question myTestQuestion = new Question(0, descriptionQuestion,new ArrayList<Answer>());
        // Act
        String result = myTestQuestion.getDescriptionQuestion();
        // Assert
        assertEquals(descriptionQuestion, result);
    }

    @Test
    public void creatingAnswerSetsProperlyCodeQuestion() {
        // Arrange
        Answer myTestAnswer = new Answer("a", "Brussels", false);
        // Act
        String result = myTestAnswer.getCodeAnswer();
        // Assert
        assertEquals("a", result);
    }

    @Test
    public void creatingQSetsProperlyIsCorrect() {
        // Arrange
        Answer myTestAnswer = new Answer("a", "Brussels", false);
        // Act
        Boolean result = myTestAnswer.getIsCorrect();
        // Assert
        assertEquals(false, result);
    }
}
