package com.andrecastrosousa.spring.basics.springbasics.basics.basic;

import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.SpringBasicsApplication;
import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.basic.BinarySearchImpl;
import  static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringBasicsApplication.class)
public class BinarySearchTest {

    @Autowired
    BinarySearchImpl binarySearchImpl;

    @Test
    void testBasicScenario() {
        assertEquals(0, binarySearchImpl.binarySearch(new int[] {}, 5));
    }
}
