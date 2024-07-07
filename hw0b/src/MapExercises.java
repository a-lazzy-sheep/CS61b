import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> map=new TreeMap<>();
        for(char c='a';c<='z';c++){
            map.put(c,c-'a'+1);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> map=new TreeMap<>();
        for(int x:nums){
            map.put(x,x*x);
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> map=new TreeMap<>();
        for(int i=0;i<words.size();i++){
            String word=words.get(i);
            int cnt=0;
            for(String w : words) {
                if (word.equals(w)){
                    cnt++;
                }
            }
            map.put(word,cnt);
        }
        return map;
    }
}
