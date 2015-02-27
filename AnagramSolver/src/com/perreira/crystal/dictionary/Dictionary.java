package com.perreira.crystal.dictionary;

import java.util.Set;

/**
 * Created by crystal on 2/26/15.
 */
public interface Dictionary { //keep broad, have as interface, then you can have all kinds of dict classes
    public boolean isWord(String s);
    public Set<String> getAllWords ();

}
