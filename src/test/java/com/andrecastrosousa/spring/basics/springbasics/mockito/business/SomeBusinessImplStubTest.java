package com.andrecastrosousa.spring.basics.springbasics.mockito.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub1());
        assertEquals(25, business.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_withOneValue() {
        SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub2());
        assertEquals(25, business.findTheGreatestFromAllData());
    }
}

class DataServiceStub1 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {25, 15, 5};
    }
}

class DataServiceStub2 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {25};
    }
}