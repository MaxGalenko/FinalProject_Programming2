/*
 * The MIT License
 *
 * Copyright 2022 maxym.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package test;

import java.util.ArrayList;

/**
 * 
 * @author Maxym Galenko
 */
public class Department {
    private int id;
    private ArrayList<String> departments;
    private ArrayList<Teacher> teachers;
    private ArrayList<Staff> staffMembers;
    private Teacher dean;

    public Department(int id, ArrayList<String> departments, ArrayList<Teacher> teachers, 
            ArrayList<Staff> staffMembers, Teacher dean) {
        this.id = id;
        this.departments = departments;
        this.teachers = teachers;
        this.staffMembers = staffMembers;
        this.dean = dean;
    }
    
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
    
    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }
    
    public void removeStaff(Staff staff) {
        staffMembers.remove(staff);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<String> departments) {
        this.departments = departments;
    }
    
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Staff> getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(ArrayList<Staff> staffMembers) {
        this.staffMembers = staffMembers;
    }

    public Teacher getDean() {
        return dean;
    }

    public void setDean(Teacher dean) {
        this.dean = dean;
    }
}
