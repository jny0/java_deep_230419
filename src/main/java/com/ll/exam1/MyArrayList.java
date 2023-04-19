package com.ll.exam1;

public class MyArrayList<T> {
    private int size = 0;
    private String[] data = new String[2];
    public int size() {
        return size;
    }

    public boolean add(String element) {
        size++;

        makeNewDataIfNotEnough();

        data[size-1] = element;
        return true;
    }

    private void makeNewDataIfNotEnough() {
        if(isNotEnough()){
            makeNewData();
        }
    }

    private void makeNewData() {
        String[] NewData = new String[data.length*2];

        for (int i = 0; i < data.length; i++) {
            NewData[i] = data[i];
        }
        data = NewData;
    }

    private boolean isNotEnough() {
        return size >= data.length;
    }

    public String get(int index) {
        return data[index];
    }
}
