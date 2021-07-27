package ua.myjavastudy.lesson10.task2;

import java.util.Iterator;

public class MyOwnArrayIterator<E> implements Iterator {

    private int index = 0;
    private E[] values;

    MyOwnArrayIterator(E[] values){
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++] ;
    }
}
