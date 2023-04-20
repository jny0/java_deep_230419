package com.ll.exam1;

public class MyArrayList<T> {
    public boolean debug = false;
    private int size = 0;
    private Object[] data;

    public int size() {
        return size;
    }

    public MyArrayList() {
        this(2);
    }

    public MyArrayList(int dataLength) {
        data = new Object[dataLength];
    }

    public boolean add(Object element) {
        makeNewDataIfNotEnough();
        data[size] = element;
        size++;
        return true;
    }

    private void makeNewDataIfNotEnough() {
        if (isNotEnough()) {
            makeNewData();
        }
    }

    private void makeNewData() {
        Object[] newData = new String[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        if (debug) {
            System.out.printf("배열크기 증가 : %d => %d\n", data.length, newData.length);
        }

        // 더 이상 리스트가 기존 배열을 가리키지 않도록 하여, 자연스럽게 가비지컬렉팅이 되도록 한다.
        data = newData;
    }

    private boolean isNotEnough() {
        return size >= data.length;
    }

    public Object get(int index) {
        return data[index];
    }

    public boolean remove(int index) {
        data[index] = null;
        return true;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < data.length; i++) {
            if (element.equals(data[i])) return i;
        }
        return -1;
    }
}
