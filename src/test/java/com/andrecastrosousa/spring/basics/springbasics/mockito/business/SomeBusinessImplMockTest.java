package com.andrecastrosousa.spring.basics.springbasics.mockito.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl someBusiness;

    @Test
    void findTheGreatestFromAllData_basicScenario() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 0});

        assertEquals(25, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_oneValue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25});

        assertEquals(25, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_emptyArray() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});

        assertEquals(Integer.MIN_VALUE, someBusiness.findTheGreatestFromAllData());
    }
}
