package com.ll.exam1;

public class MyArrayList<T> {
    private int size = 0;
    private String[] data = new String[100];
    public int size() {
        return size;
    }

    public boolean add(String element) {
        makeNewDataIfNotEnough();
        data[size] = element;
        size++;
        return true;
    }

    private void makeNewDataIfNotEnough() {
        if(isNotEnough()){
            makeNewData();
        }
    }

    private void makeNewData() {
        String[] newData = new String[data.length*2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private boolean isNotEnough() {
        return size >= data.length;
    }

    public String get(int index) {
        return data[index];
    }

    public boolean remove(int index) {
        data[index] = null;
        return true;
    }
}
