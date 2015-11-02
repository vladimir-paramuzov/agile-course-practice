package ru.unn.agile.Stack.Model;

/**
 * Created by Ilya on 02.11.2015.
 */
public class Stack {
    private Object[] values = new Object[0];

    public Stack(Object[] inputArray) {
        values = inputArray.clone();
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < values.length; ++i) {
            res += values[i];
            if (i != values.length - 1) {
                res += " ";
            }
        }
        return res;
    }
}
