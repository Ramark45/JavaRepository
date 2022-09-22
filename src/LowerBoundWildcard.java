import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {
    public static void print(List<?> AllElements)
    {
        System.out.println(AllElements);
    }
    public static void main(String[] args) {
        List<Integer> il=new ArrayList<>();
        il.add(16);
        il.add(18);
        print(il);
        List<Double> dl=new ArrayList<>();
        dl.add(11.5);
        dl.add(42.5);
        dl.add(33.5);
        print(dl);
    }
}
