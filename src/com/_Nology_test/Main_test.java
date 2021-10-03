package com._Nology_test;

import com._Nology.Answer;
import com._Nology.Main;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Main_test {

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
