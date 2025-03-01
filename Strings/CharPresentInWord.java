import java.util.ArrayList;
import java.util.List;

public class CharPresentInWord { 
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                res.add (i);
            }
        }
        return res;
    } 
}
