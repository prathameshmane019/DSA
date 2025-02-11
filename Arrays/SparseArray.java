import java.util.*;

class Result {
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. STRING_ARRAY stringList
     * 2. STRING_ARRAY queries
     */

      List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for (String query : queries) {  
            int count = 0;
            for (String str : stringList) {  
                if (str.equals(query)) {  
                    count++;
                }
            }
            result.add(count);
        }

        return result;
        
    }
}

public class SparseArray {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ab", "ab", "abc");
        List<String> queries = Arrays.asList("ab", "abc", "bc");
        Result result = new Result();
        List<Integer> res = result.matchingStrings(stringList, queries);

        for (Integer integer : res) {
            System.out.println(integer);
        }
    }
}
