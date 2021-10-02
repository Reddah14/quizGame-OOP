package com._Nology_test;

import com._Nology.Answer;
import com._Nology.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main_test {
    @Test
    public void isValidAnswerWithAllowedAanswer_isValid() {
        // Arrange
        String selectedAnswer = "a";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithAllowedBanswer_isValid() {
        // Arrange
        String selectedAnswer = "b";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithAllowedCanswer_isValid() {
        // Arrange
        String selectedAnswer = "c";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithAllowedDanswer_isValid() {
        // Arrange
        String selectedAnswer = "d";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithAllowedAanswerToUpper_isValid() {
        // Arrange
        String selectedAnswer = "A";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithAllowedBanswerToUpper_isValid() {
        // Arrange
        String selectedAnswer = "B";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithAllowedCanswerToUpper_isValid() {
        // Arrange
        String selectedAnswer = "C";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithAllowedDanswerToUpper_isValid() {
        // Arrange
        String selectedAnswer = "D";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isValidAnswerWithNotAllowedLetters_isInvalid() {
        // Arrange
        String selectedAnswer = "D";
        Main main = new Main();
        // Act
        Boolean result = main.isValidAnswer(selectedAnswer);
        // Assert
        assertEquals(true, result);
    }
}
