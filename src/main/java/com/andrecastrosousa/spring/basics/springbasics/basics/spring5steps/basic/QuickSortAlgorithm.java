package com.andrecastrosousa.spring.basics.springbasics.basics.spring5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}
