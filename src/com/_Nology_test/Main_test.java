package com._Nology_test;

import com._Nology.Answer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main_test {
    @Test
    public void test() {
        // Arrange
        Answer mytestAnswer = new Answer("a", "Brussels", false);
        // Act
        String result = mytestAnswer.getDescriptionAnswer();
        // Assert
        assertEquals("Brussels", result);
    }
}
