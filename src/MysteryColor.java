import java.util.List;
import java.util.ArrayList;
public class MysteryColor implements MysteryColorAnalyzer {
    @Override
    public int numberOfDistinctColors(List<Colors> mysteryColors) {
        ArrayList<Colors> mysteryColorFound = new ArrayList<>();
        for (Colors color : mysteryColors) {
            if (!mysteryColorFound.contains(color)) {
                mysteryColorFound.add(color);
            }
        }
        return mysteryColorFound.size();
    }

    @Override
    public int colorOccurrence(List<Colors> mysteryColors, Colors color) {
        int number = 0;
        for (Colors cl : mysteryColors) {
            if (cl.equals(color))
                number++;
        }
        return number;
    }

    public static void main(String[] args) {
        ArrayList<Colors> list = new ArrayList<>(5);
        list.add(Colors.RED);
        list.add(Colors.BLUE);
        list.add(Colors.GREEN);
        list.add(Colors.BLUE);
        list.add(Colors.GREEN);
        System.out.println(list);
        System.out.println(new MysteryColor().numberOfDistinctColors(list));
        System.out.println(new MysteryColor().colorOccurrence(list,Colors.BLUE));
    }
}
enum Colors{
    RED,BLUE,GREEN;
}
