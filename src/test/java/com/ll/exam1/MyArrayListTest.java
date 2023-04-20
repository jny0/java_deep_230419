package com.ll.exam1;

import com.ll.TestUt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

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

        // 초기 배열의 길이
        int dataLength1 = ((String[]) TestUt.getFieldValue(list, "data", null)).length;

        // IntStream.range(0, 10); = [0, ... 9] 까지의 int 스트림 발생
        // 딱 1번 넘칠만큼의 데이터를 넣는다.
        IntStream.range(0, dataLength1 + 1)
                .forEach(index -> list.add("사과 %d".formatted(index)));

        // 현재 배열의 길이
        int dataLength2 = ((String[]) TestUt.getFieldValue(list, "data", null)).length;
        assertThat(dataLength2).isGreaterThan(dataLength1);
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