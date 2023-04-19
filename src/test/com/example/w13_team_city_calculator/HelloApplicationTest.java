package com.example.w13_team_city_calculator;

import javafx.scene.control.TextField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test() {
        HelloApplication test = new HelloApplication();
        double result = test.add2Numbers(new TextField("2"), new TextField("3"));
        assertEquals(5, result);
    }
}