package org.example;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void added() {
        Main app=new Main();
        assertEquals(10,app.added(5,5));
    }
}