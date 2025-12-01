import java.util.HashSet;
import java.util.Set;

public class MatchingKLengthSubstrings {

    public static int countMatchingSubstringsEither(String s1, String s2, int k) {
        if (k <= 0) return 0;
        Set<String> substringsS1 = new HashSet<>();
        Set<String> substringsS2 = new HashSet<>();

        for (int i = 0; i <= s1.length() - k; i++) {
            substringsS1.add(s1.substring(i, i + k));
        }

        for (int i = 0; i <= s2.length() - k; i++) {
            substringsS2.add(s2.substring(i, i + k));
        }

        // Combine both
        Set<String> union = new HashSet<>(substringsS1);
        union.addAll(substringsS2);

        // Count how many of them are present in both sets
        int count = 0;
        for (String sub : union) {
            if (s1.contains(sub) || s2.contains(sub)) {
                if (s1.contains(sub) && s2.contains(sub)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "xyzzz";
        String s2 = "xyzxy";
        int k = 3;

        int result = countMatchingSubstringsEither(s1, s2, k);
        System.out.println("Matching substrings of length " + k + " in both strings: " + result);
    }
}
