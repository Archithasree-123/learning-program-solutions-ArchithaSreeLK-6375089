package com.architha.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // assertEquals: Check if two values are equal
        assertEquals(5, 2 + 3);

        // assertTrue: Condition must be true
        assertTrue(5 > 3);

        // assertFalse: Condition must be false
        assertFalse(5 < 3);

        // assertNull: Value should be null
        Object obj1 = null;
        assertNull(obj1);

        // assertNotNull: Value should NOT be null
        Object obj2 = new Object();
        assertNotNull(obj2);
    }
}

