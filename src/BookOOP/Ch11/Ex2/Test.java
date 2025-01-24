package BookOOP.Ch11.Ex2;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
                // Create a Person object
                Person person = new Person("Alice", "123 Main St", "123-456-7890", "alice@example.com");
                System.out.println(person);

                // Create a Student object
                Student student = new Student("Bob", "456 Elm St", "987-654-3210", "bob@example.com", "Freshman");
                System.out.println(student);

                // Create an Employee object
                Date dateHired = new Date(2020, 5, 15);
                Employee employee = new Employee("Charlie", "789 Oak St", "555-123-4567", "charlie@example.com", "Room 101", 55000, dateHired);
                System.out.println(employee);

                // Create a Faculty object
                Faculty faculty = new Faculty("David", "321 Pine St", "111-222-3333", "david@example.com", "Room 202", 70000, dateHired, "9am-5pm", "Professor");
                System.out.println(faculty);

                // Create a Staff object
                Staff staff = new Staff("Eve", "654 Maple St", "333-444-5555", "eve@example.com", "Room 303", 45000, dateHired, "Administrator");
                System.out.println(staff);

    }
}
