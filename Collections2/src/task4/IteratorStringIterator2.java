package task4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorStringIterator2 implements Iterator<String> {

    private Iterator subIterator;
    private IteratorStringIterator2 newIterator;

    public IteratorStringIterator2(Iterator iniIterator) {
        this.subIterator = iniIterator;
    }

    @Override
    public boolean hasNext() {
        if (subIterator.hasNext()) return true;
        if (newIterator != null) return newIterator.hasNext();
        return false;

    }

    @Override
    public String next() {
        if(!hasNext())
            throw new NoSuchElementException();

        Object obj = null;
        if (newIterator != null && newIterator.hasNext()) obj = newIterator.next();

        if (subIterator.hasNext() && obj == null) {
            obj = subIterator.next();

            if (obj instanceof Iterator && ((Iterator) obj).hasNext()) {
                newIterator = new IteratorStringIterator2((Iterator) obj);

            }
        }

        if(obj instanceof Iterator){
            obj = next();
        }

        return (String) obj;
    }
}
