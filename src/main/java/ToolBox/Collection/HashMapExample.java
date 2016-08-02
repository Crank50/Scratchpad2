package ToolBox.Collection;

import java.util.HashMap;


/**
 * Created by Justin on 7/20/16.
 */
public class HashMapExample {

    // Create a new HashMap named names that holds String,String
    HashMap<String, String> names = new HashMap<>();

    public static void main(String[] args) {
        HashMapExample hashMapExample = new HashMapExample();
        hashMapExample.addElement("teacher", "pre-school");


    }

    // add another key,value to the HashMap

    public void addElement(String key, String value) {
        names.put(key, value);
    }

    // get a value from the HashMap at a specific key
    public String getValue(String key) {
        return names.get(key);
    }

    // print out all the Strings in the HashMap
    public void printAllElements() {
        //  Set<String> keys = names.keySet();
        //for( int i = 0; i < keys.size(); i++) {
        //  System.out.println(names.);
        for (String name : names.values()) {
            System.out.println(name);
        }
    }


}
