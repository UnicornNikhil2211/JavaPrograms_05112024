import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("I am learning Jenkins with Java very successfully. It has been grate experience for me. Wow!!!");
        System.out.println(new Date());

        System.out.println("It is an initial commit.");

        System.out.println("This is my second commit with IntelliJ Idea.");

        System.out.println("Added one more file.");

        Student std = new Student(102, "Nikhil Borkar", "IT");

        System.out.println("Student Details:");
        System.out.println("Id : " + std.getId() );
        System.out.println("Name : " + std.getName());
        System.out.println("Department : " + std.getDept());


    }
}