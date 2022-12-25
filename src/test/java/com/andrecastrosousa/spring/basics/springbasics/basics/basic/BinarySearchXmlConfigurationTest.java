package com.andrecastrosousa.spring.basics.springbasics.basics.basic;

import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.basic.BinarySearchImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXmlConfigurationTest {
    @Autowired
    BinarySearchImpl binarySearchImpl;

    @Test
    void testBasicScenario() {
        assertEquals(0, binarySearchImpl.binarySearch(new int[] {}, 5));
    }
}
