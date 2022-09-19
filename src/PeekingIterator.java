import java.util.Iterator;

public class PeekingIterator implements Iterator {

    private Integer next = null;
    private Iterator<Integer> iter;

    public PeekingIterator(Iterator<Integer> iterator) {
        iter = iterator;
        if (iter.hasNext())
            next = iter.next();
    }

    public PeekingIterator(int a, int b, int c) {

    }

    public Integer peek() {
        return next;
}
    @Override
    public Integer next() {
        Integer res = next;
        next = iter.hasNext() ? iter.next() : null;
        return res;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    public static void main(String[] args) {
        int a=1;int b=2;int c=3;
        PeekingIterator itr1 = new PeekingIterator(a,b,c);
        //System.out.println(itr1.next());
        itr1.next();
        itr1.peek();
        itr1.next();
        itr1.next();
        //itr1.next();
        //itr1.hasNext();



    }
}
