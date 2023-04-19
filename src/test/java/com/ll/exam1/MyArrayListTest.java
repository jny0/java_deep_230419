package com.ll.exam1;

import com.ll.exam1.MyArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {

    @Test
    @DisplayName("size()")
    void t001() {
        MyArrayList<String> list = new MyArrayList();
        assertEquals(0, list.size());
    }

    @Test
    @DisplayName("add(\"사과\")")
    void t002() {
        MyArrayList<String> list = new MyArrayList();
        list.add("사과");
        list.add("포도");
        assertEquals(2, list.size());
    }

    @Test
    @DisplayName("get(1)")
    void t003() {
        MyArrayList<String> list = new MyArrayList();
        list.add("사과");
        list.add("포도");
        assertThat(list.get(0)).isEqualTo("사과");
        assertThat(list.get(1)).isEqualTo("포도");
    }

}