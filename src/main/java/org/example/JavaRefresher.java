
package org.example;

public class JavaRefresher {
    public static void main(String[] args) {

        var name = "Internship Student";
        var day = 1;

        System.out.println("Name: " + name);
        System.out.println("Day: " + day);

        record Student(String name, int age) {}

        Student student = new Student("Shahanaa", 21);
        System.out.println("Student: " + student.name());

        String message = """
                Welcome to Day 1!
                Learning Java 21.
                Practising Git and Maven.
                """;

        System.out.println(message);
    }
}
