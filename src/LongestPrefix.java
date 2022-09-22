import java.util.*;
import java.lang.*;
import java.io.*;
public class LongestPrefix {
    public String longestCommonPrefix(String[] Str) {
        if (Str.length == 0) return "";
        String prefix = Str[0];
        for (int i = 1; i < Str.length; i++)
            while (Str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String args[]) {

        LongestPrefix ob = new LongestPrefix();

        String arr[] = {"flower", "flow", "flight"};
        String arr2[] ={"dog","racecar","car"};
        System.out.println(ob.longestCommonPrefix(arr));
        System.out.println(ob.longestCommonPrefix(arr2));

    }
}

