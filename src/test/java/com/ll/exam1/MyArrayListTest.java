package com.ll.exam1;

import com.ll.exam1.MyArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {

    @Test
    void testSize() {
        MyArrayList<String> list = new MyArrayList();
        assertEquals(0, list.size());
    }

}