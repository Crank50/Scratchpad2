package Week1.Day1;

/**
 * Created by Justin on 7/11/16.
 */
public class Day1VariableCollector {


    private String s = "Marksman";
    private int year = 2012;
    private boolean b = true;
    private long Centimeter;
    private char grade;
    private char [] ca = {'a', 'b', 'c'};


    String getString(){
    return s;
    }

    void setS(String newS){
        s = newS;
    }

    public String getS() {
        return s;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public long getCentimeter() {
        return Centimeter;
    }

    public void setCentimeter(long centimeter) {
        Centimeter = centimeter;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char[] getCa() {
        return ca;
    }

    public void setCa(char[] ca) {
        this.ca = ca;
    }
}




