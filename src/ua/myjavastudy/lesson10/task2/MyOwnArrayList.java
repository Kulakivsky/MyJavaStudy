package ua.myjavastudy.lesson10.task2;

import java.util.Iterator;
import java.util.List;

public class MyOwnArrayList<E> implements Simple<E> {
    public static void main(String[] args) {
        Simple<String> strings = new MyOwnArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("tree");

        for (String s : strings) {
            System.out.println(s);
        }
    }


    private E[] values;

    public MyOwnArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length+1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;

    }

    @Override
    public void delete(int index) {
    /*
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp, index + 1, //src
                    values, index, //target
                    amountElemAfterIndex); //amount
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
     */
    }


    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyOwnArrayIterator<>(values);
    }
}
