package ToolBox;

// Method template -- return NAME (receives) {}

/**
 * Created by Justin on 7/13/16.
 */
public class Template {

    private String s = "Marksman";
    private int year = 2012;
    private boolean b = true;
    private long Centimeter;
    private char grade;
    private char[] ca = {'a', 'b', 'c'};
    // this is the main method - access modifier of public -

    // variable  - access modifier "public" - "primitive type - integer" - name "a" = assigns 7
    public int a = 7;


    // variable - access modifier "public" - "primitive type boolean" - named question as "IsCat" - assigns true
    public boolean isCat = true;
    public boolean isDog = false;

    // variable - default access modifier - primitive type double - name of mark - assigned 22.5
    double mark = 22.5;
    double tina = 11.7;
    double steve = 77;
    double hesh = 1;
    double mash = 2;
    double stash = 3;


    public String black = "Hello";
    public String white = "Goodbye";
    public String[] infinite = {"yo", "sup", "dude", "chaz"};
    public String[] sports = {"football", "soccer", "basketball", "Bmx"};
    public String[] drinks = {"Margerita", "Beer", "bloody mary", "Kumbucha"};
    public String[] things = {"Stack", "shelf", "block", "cash", "computer", "sky"};


    public static void main(String[] args) {

        Template t = new Template(); {
        System.out.println(newby(5, 6));
        System.out.println(t.chaz(5, 6.1));
        System.out.println(t.chaz());
        System.out.println(t.car());



        }
    }

    // this is a method
    double chaz() {
        return a + mark;
    }

    // this is a method
    double chaz(int i, double d) {
        double e = i + d;
        return e;
    }
    //cannot return with void
    //public static is an access modifier

    public static double newby(int d, int c) {
        double q = d + c;
        return q;
    }

    public String car() {
        return "honk";
    }

    }


    /* if i printed this would it print?
    boolean you() {
        return isCat;

       // how do I identify these variables to a true or false for the boolean?
        // what am I trying to do with this line of code?
     private static boolean fast(boolean s, boolean g) {
            boolean l = true;
            return l;

    }
    public double zach() {
        int z = c+h;
                return z;
    }
    private int craig() {
        int zz = a + h;
        return zz;
    }



    }
    }

*/

