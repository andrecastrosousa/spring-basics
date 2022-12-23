package com.andrecastrosousa.spring.basics.springbasics.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void test() {
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");

        assertTrue(test);
        assertFalse(test2);
        //assertNull, assertNotNull
        assertArrayEquals(new int[] {1,2}, new int[] {1, 2});
        assertEquals(3, todos.size());

    }
}
