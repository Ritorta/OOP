package controller;

import java.util.List;

import data.StudentGroup;
import data.User;

public interface UserController<T extends User> 
{
    void createGroup(String groupName);
    void addStudentToGroup(StudentGroup<T> group, T student);
    void removeStudentFromGroup(StudentGroup<T> group, T student);
    List<StudentGroup<T>> getGroups();
}
