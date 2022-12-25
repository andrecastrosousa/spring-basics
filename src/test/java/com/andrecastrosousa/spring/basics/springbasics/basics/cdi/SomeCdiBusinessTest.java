package com.andrecastrosousa.spring.basics.springbasics.basics.cdi;

import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.SpringCdiApplication;
import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.cdi.SomeCdiBusiness;
import com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.cdi.SomeCdiDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    @Mock
    SomeCdiDao daoMock;

    @InjectMocks
    SomeCdiBusiness someCdiBusiness;

    @Test
    void test() {

        when(daoMock.getData()).thenReturn(new int[] {5, 89, 100});

        assertEquals(100, someCdiBusiness.findGreatest());
    }
}
