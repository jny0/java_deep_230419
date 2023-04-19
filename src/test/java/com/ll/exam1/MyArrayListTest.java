package com.ll.exam1;

import com.ll.TestUt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    @DisplayName("data(배열)의 크기가 자동으로 늘어나야 한다.")
    void t4() {
        MyArrayList<String> list = new MyArrayList<>();

        String[] data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(2);

        list.add("사과");
        list.add("포도");

        data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(2);

        list.add("당근");

        data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(4);

        assertThat(list.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("remove(0)")
    void t005() {
        MyArrayList<String> list = new MyArrayList();
        list.add("사과");
        list.add("포도");
        assertTrue(list.remove(0));
        assertThat(list.get(0)).isEqualTo(null);
    }


}