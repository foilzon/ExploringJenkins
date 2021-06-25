package com.algo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isNumberPositiveTest() {
        IfElse ie = new IfElse();
        assertArrayEquals(new boolean[]{ie.isNumberPositive(1)}, new boolean[]{true});
    }
}