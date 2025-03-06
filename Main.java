import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("I am learning Jenkins with Java very successfully. It has been grate experience for me. Wow!!!");
        System.out.println(new Date());

        System.out.println("It is an initial commit.");

        System.out.println("This is my second commit with IntelliJ Idea.");

        System.out.println("Added one more file.");

        Student std1 = new Student(101, "Nikhil Borkar", "IT");

        System.out.println("Student Details:");
        System.out.println("Id : " + std1.getId() );
        System.out.println("Name : " + std1.getName());
        System.out.println("Department : " + std1.getDept());

        Student std2 = new Student(102, "Swapnil Borkar", "Economics");

        System.out.println("Student Details:");
        System.out.println("Id : " + std2.getId() );
        System.out.println("Name : " + std2.getName());
        System.out.println("Department : " + std2.getDept());

        System.out.println("New feature branch added.");
    }
}