import javax.print.attribute.standard.Media;
import java.util.List;
import java.util.ArrayList;

public class GenericLibrary<E extends Media> {
    private List<E> resources = new ArrayList<E>();
    public void addMedia(E x) {
        resources.add(x);
    }
    public E retrieveLast() {
        int size = resources.size();
        if (size > 0) {
            return resources.get(size - 1);
        }
        return null;
    }

}
