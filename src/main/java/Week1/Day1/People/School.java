package Week1.Day1.People;

/**
 * Created by Justin on 7/11/16.
 */
public class School {


    public static void main(String[] args) {



        Teacher t = new Teacher();
        t.setName("Phil");
        t.setAge(99);
        t.setGender("Male");
        t.setSalary(43000.12);
        System.out.println("Teacher 1");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getGender());
        System.out.println(t.getSalary());


        Teacher t2 = new Teacher();
        t2.setName("Jenny");
        t2.setAge(6);
        t2.setGender("Male");
        t2.setSalary(200000000.1);
        System.out.println("Teacher 2");
        System.out.println(t2.getName());
        System.out.println(t2.getAge());
        System.out.println(t2.getGender());
        System.out.println(t2.getSalary());

        Student s = new Student();
        s.setName("Burgundy");
        s.setGender("Trans");
        s.setAge(102);
        s.setGpa(4.0);
        System.out.println("Student");
        System.out.println(s.getName());
        System.out.println(s.getGender());
        System.out.println(s.getAge());
        System.out.println(s.getGpa());




    }
}
