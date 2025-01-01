package com.project;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void helloWorldTest() {

        System.out.println("Hello World!");
        assertEquals("Hello World!", outputStreamCaptor.toString().trim());

    }

    @Test
    public void helloWorld123Test() {

        System.out.println("Hello World!");
        System.out.println("123");

        assertEquals("Hello World!\r\n123", outputStreamCaptor.toString().trim());

    }

}
