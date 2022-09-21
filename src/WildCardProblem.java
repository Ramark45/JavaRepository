import java.util.ArrayList;
import java.util.List;

public class WildCardProblem {
    public static void print(List<?> AllElements)
    {
        System.out.println(AllElements);
    }

    public static void main(String[] args) {
        List<Integer> il=new ArrayList<>();
        il.add(10);
        il.add(20);
        print(il);
        List<Double> dl=new ArrayList<>();
        dl.add(1.5);
        dl.add(2.5);
        dl.add(3.5);
        print(dl);
    }
}
