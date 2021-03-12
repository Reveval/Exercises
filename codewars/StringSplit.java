import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {
    public static String[] solution(String s) {
        String regex = "[(\\w\\s)]{2}";
        if (s.length() % 2 != 0) {
            s = s.concat("_");
        }
        int size = s.length() / 2;
        int i = 0;
        String[] str = new String[size];
        Matcher matcher = Pattern.compile(regex).matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            str[i++] = group;
        }
        return str;
    }

    public static void main(String[] args) {
        String[] arr = solution("Hello World");
        for (String s : arr) {
            System.out.println(s);
            System.out.println("Some changes");
        }
    }
}
