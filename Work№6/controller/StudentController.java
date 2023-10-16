package controller;

import view.UserView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import data.StudentGroup;
import data.Student;
import data.User;


class StudentController<T extends User> {
     private List<StudentGroup<T>> groups;
   private UserView<T> userView;

   public StudentController(UserView<T> userView) {
       groups = new ArrayList<>();
       this.userView = userView;
   }

   public void createGroup(String groupName) {
       StudentGroup<T> group = new StudentGroup<>(groupName);
       groups.add(group);
   }

   public void addStudentToGroup(StudentGroup<T> group, T student) {
       group.addStudent(student);
   }

   public void removeStudentFromGroup(StudentGroup<T> group, T student) {
       group.removeStudent(student);
   }

   public List<StudentGroup<T>> getGroups() {
       return groups;
   }

   public void sendGroupsOnConsole() {
       userView.sendOnConsole(groups);
   }
}
