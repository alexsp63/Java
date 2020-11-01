package task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TwoIterators<T> implements Iterator<T> {

    private Iterator<T> Iterator1;
    private Iterator<T> Iterator2;

    public TwoIterators(Iterator<T> Iterator1, Iterator<T> Iterator2){
        this.Iterator1 = Iterator1;
        this.Iterator2 = Iterator2;
    }

    @Override
    public boolean hasNext() {
        if (Iterator1.hasNext()){
            return true;
        }
        if (Iterator2.hasNext()){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        while (Iterator1.hasNext()) {
            return Iterator1.next();
        }
        while (Iterator2.hasNext()) {
            return Iterator2.next();
        }
        return null;
    }
}
