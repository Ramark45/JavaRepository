import java.util.ArrayList;
import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer>{
    Iterator<Integer> itr;
    Integer peek;
    public PeekingIterator(Iterator<Integer>number)
    {
        itr=number;
        peek=null;
    }
    @Override
    public boolean hasNext()
    {
        return itr.hasNext();
    }

    @Override
    public Integer next() {
        if(itr.hasNext())
        {
            peek= itr.next();
            return peek;
        }
        else
        {
            return  0;
        }
    }
    public Integer peek()
    {
        return peek;
    }

    @Override
    public void remove() {

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(10);
        list.add(222);
        list.add(30);
        PeekingIterator ptr=new PeekingIterator(list.iterator());
        System.out.println(ptr.next());
        System.out.println(ptr.peek());
        System.out.println(ptr.next());
        System.out.println(ptr.hasNext());
        System.out.println(ptr.peek());
        System.out.println(ptr.peek());
        System.out.println(ptr.hasNext());
    }

}
