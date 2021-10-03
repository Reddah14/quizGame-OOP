package com._Nology_test;

import com._Nology.Answer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Answer_test {
    @Test
    public void creatingAnswerSetsProperlyCodeAnswer() {
        // Arrange
        Answer myTestAnswer = new Answer("a", "Brussels", false);
        // Act
        String result = myTestAnswer.getCodeAnswer();
        // Assert
        assertEquals("a", result);
    }

    @Test
    public void creatingAnswerSetsProperlyDescriptionAnswer() {
        // Arrange
        Answer myTestAnswer = new Answer("a", "Brussels", false);
        // Act
        String result = myTestAnswer.getDescriptionAnswer();
        // Assert
        assertEquals("Brussels", result);
    }

    @Test
    public void creatingAnswerSetsProperlyIsCorrect() {
        // Arrange
        Answer myTestAnswer = new Answer("a", "Brussels", false);
        // Act
        Boolean result = myTestAnswer.getIsCorrect();
        // Assert
        assertEquals(false, result);
    }
}
