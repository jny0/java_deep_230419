package com.ll.exam1;

public class MyArrayList<T> {
    private int size = 0;
    public int size() {
        return size;
    }

    public boolean add(T element) {
        size++;
        return true;
    }

    public String get(int i) {
        return "포도";
    }
}
