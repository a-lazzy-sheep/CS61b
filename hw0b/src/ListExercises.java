import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum=0;
        for(int x:L){
            sum+=x;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> even=new ArrayList<>();
        for(int x:L){
            if(x%2==0){
                even.add(x);
            }
        }
        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> common=new ArrayList<>();
        for(int x:L1){
            for(int y:L2){
                if(x==y){
                    common.add(x);
                }
            }
        }
        return common;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count=0;
        for(String word:words){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==c){
                    count+=1;
                }
            }
        }
        return count;
    }
}
