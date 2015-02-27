import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by crystal on 2/24/15.
 */

public class MadLibs {
    public static void main(String[] args){
        ArrayList<String> libs = new ArrayList<String>();
        ArrayList<String> mads = new ArrayList<String>();
        String[] strings = {"My name is ", "I live in ", "I like ", "I don't like "};
        String[] moreStrings = {"Crystal", "Seattle", "bugs", "meanies"};
        libs.addAll(Arrays.asList(moreStrings));
        mads.addAll(Arrays.asList(strings));
        System.out.println(mads.get(0) + libs.get(0));
        System.out.println(mads.get(1) + libs.get(1));
        System.out.println(mads.get(2) + libs.get(2));
        System.out.println(mads.get(3) + libs.get(3));
    }
}
