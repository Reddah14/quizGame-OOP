package com._Nology_test;

import com._Nology.Answer;
import com._Nology.Main;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
        String[] notAllowedLetters = {"e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Main main = new Main();

        for (int index = 0; index < notAllowedLetters.length; index++) {
            // Act
            Boolean result = main.isValidAnswer(notAllowedLetters[index]);
            // Assert
            assertEquals(false, result);
        }
    }

    @Test
    public void isValidAnswerWithNotAllowedNumbers_isInvalid() {
        // Arrange
        String[] notAllowedNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Main main = new Main();

        for (int index = 0; index < notAllowedNumbers.length; index++) {
            // Act
            Boolean result = main.isValidAnswer(notAllowedNumbers[index]);
            // Assert
            assertEquals(false, result);
        }
    }

    @Test
    public void isCorrectAnswerWithCorrectSelectedAnswer_isTrue() {
        // Arrange
        Main main = new Main();
        ArrayList<Answer> testAnswers = new ArrayList<Answer>();
        testAnswers.add(main.createAnswer("a", "San Juan", false));
        testAnswers.add(main.createAnswer("b", "Asuncion", false));
        testAnswers.add(main.createAnswer("c", "San Jose", true));
        testAnswers.add(main.createAnswer("d", "Santiago", false));
        String selectedCodeAnswer = "c";

        // Act
        Boolean result = main.isCorrectThisAnswer(selectedCodeAnswer, testAnswers);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void isCorrectAnswerWithNonCorrectSelectedAnswer_isFalse() {
        // Arrange
        Main main = new Main();
        ArrayList<Answer> testAnswers = new ArrayList<Answer>();
        testAnswers.add(main.createAnswer("a", "San Juan", false));
        testAnswers.add(main.createAnswer("b", "Asuncion", false));
        testAnswers.add(main.createAnswer("c", "San Jose", true));
        testAnswers.add(main.createAnswer("d", "Santiago", false));
        String selectedCodeAnswer = "a";

        // Act
        Boolean result = main.isCorrectThisAnswer(selectedCodeAnswer, testAnswers);

        // Assert
        assertEquals(false, result);
    }
}
