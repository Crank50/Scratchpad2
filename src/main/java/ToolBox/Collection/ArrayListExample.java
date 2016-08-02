package ToolBox.Collection;

import java.util.ArrayList;

/**
 * Created by Justin on 7/20/16.
 */
public class ArrayListExample {


    // Create a new ArrayList named name that holds Strings
    ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.addElement("bob");
        arrayListExample.addElement("lex");
        arrayListExample.addElement("farsey");
        arrayListExample.addElement("tank");
        arrayListExample.addElement("sally");
        System.out.println("element at 4: " + arrayListExample.getElement(4));
        arrayListExample.printAllElements();


    }

    // add another String to the ArrayList
    public void addElement(String name) {
        names.add(name);
    }

    // get a String from the ArrayList at a specific index
    public String getElement(int index) {
        return names.get(index);

    }

    // print out all the Strings in the ArrayList
    public void printAllElements() {

        for (String name : names) {
            System.out.println(name);

            //  System.out.println(names);
            // System.out.println("-------------toString------------");
            // System.out.println(names.toString());

        }
    }

}
