package com.inclass;

public class CustomArray<T> {
    protected Object[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int ptr = -1;

    public CustomArray(int size) {
        this.data = new Object[size];
    }

    public CustomArray() {
        this.data = new Object[DEFAULT_SIZE];
    }

    protected boolean isFull() {
        if (ptr == data.length - 1) {
            Object[] duplicate = new Object[data.length * 2];
            System.arraycopy(data, 0, duplicate, 0, data.length);
            data = duplicate;
        }
        return false;
    }

    protected boolean isEmpty() {
        return ptr == -1;
    }

    @Override
    public String toString() {
        int iMax = ptr;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(data[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
