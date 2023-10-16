// Work №6, Урок 6. ООП Дизайн и Solid

// Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, 
// усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, 
// которые рефакторим, какой принцип применяем и почему.

import data.Student;
import data.StudentGroup;
import data.User;
import view.StudentView;
import controller.StudentController;

public class Main {
    public static void main(String[] args) {
        // Create StudentController object
        StudentController<User> studentController = new StudentController<>(new StudentView());

        // Create groups
        studentController.createGroup("Group 1");
        studentController.createGroup("Group 2");

        // Create students
        Student student1 = new Student("John", "Doe", "Fox", (long) 1);
        Student student2 = new Student("Jane", "Smith", "Ojld", (long) 2);

        // Add students to groups
        StudentGroup<User> group1 = studentController.getGroups().get(0);
        StudentGroup<User> group2 = studentController.getGroups().get(1);
        studentController.addStudentToGroup(group1, student1);
        studentController.addStudentToGroup(group2, student2);

        // Send groups on console
        studentController.sendGroupsOnConsole();
    }
}