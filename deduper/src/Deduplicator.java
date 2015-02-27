import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by crystal on 2/26/15.
 */
//input is a list of strings (has duplicates)
    //output is a list of strings without duplication (no duplicates)
public class Deduplicator {

    public static List<String> dedupe(List<String> list) {
        Set<String> set = new HashSet<String>(list); //set can only have unique items
        return new ArrayList<String>(set);
    }

    //public static <E> List<E> dedupe(List<E> list) ... etc. change everything to E (could be something else like X)

    public static void main(String[] args){ // just a simplification,
        List<String> myStrings = new ArrayList<String>();
        myStrings.add("blah");
        myStrings.add("fjdk");
        myStrings.add("blah");

        List<String> uniqueStrings = dedupe(myStrings);
        for (String s: uniqueStrings){
                System.out.println(s);
        }
    }
}
