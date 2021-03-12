import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Troll {
    public static String disemvowel(String str) {
        String regex = "[aeiouAEIOU]*";
        Matcher matcher = Pattern.compile(regex).matcher(str);
        String newStr = matcher.replaceAll("");
        return newStr;
    }

    public static void main(String[] args) {
        String get = Troll.disemvowel("Vowels, in English");
        System.out.println(get);
    }
}
