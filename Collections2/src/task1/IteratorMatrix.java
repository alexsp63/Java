package task1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorMatrix<T> implements Iterable<T>{

    private T[][] array;

    public IteratorMatrix(T[][] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private int i, j;

            @Override
            public boolean hasNext() {
                for(int i = this.i; i< array.length; i++){
                    for(int j = this.j; j< array[i].length; j++){
                        return i< array.length && j< array[i].length;
                    }
                }
                return false;
            }

            @Override
            public T next() {
                if(!hasNext())
                    throw new NoSuchElementException();
                T t = array[i][j];
                j++;
                for(int i = this.i; i< array.length; i++){
                    for(int j = (i == this.i ? this.j : 0); j< array[i].length; j++){
                        this.i = i;
                        this.j = j;
                        return t;
                    }
                }
                return t;
            }
        };
    }
}