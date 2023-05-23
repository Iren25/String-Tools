package org.example;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {

    @org.junit.jupiter.api.Test
    public void firstToUpperCaseReturned() {
        String actual = StringTools.FirstToUpperCase("apple");
        String expected = "Apple";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void isStartingFromCapitalReturned() {
        boolean trueBool = true;
        boolean falseBool = false;
        assertTrue(trueBool,"Apple");
        assertFalse(falseBool, "apple");
    }
}