package com.andrecastrosousa.spring.basics.springbasics.mockito.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    @Test
    void simpleTest() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(3);

        assertEquals(3, listMock.size());
    }

    @Test
    void multipleReturns() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(1).thenReturn(2);

        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    void parameters() {
        List listMock = mock(List.class);

        when(listMock.get(0)).thenReturn("SomeString");

        assertEquals("SomeString", listMock.get(0));
        assertNull(listMock.get(1));
    }

    @Test
    void genericParameters() {
        List listMock = mock(List.class);

        when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");

        assertEquals("SomeOtherString", listMock.get(0));
        assertEquals("SomeOtherString", listMock.get(1));
    }
}
