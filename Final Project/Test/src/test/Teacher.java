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

import java.util.Objects;

/**
 * 
 * @author Maxym Galenko
 */
public class Teacher extends Person implements PayRoll {
    private String speciality;
    private String degree;
    private boolean isFullTime;
    private int hoursWorked;
    
    public Teacher() {
            super("", 0, "", "", "");
            this.speciality = "";
            this.degree = "";
            this.isFullTime = false;
            this.hoursWorked = 0;
        }
    
    public Teacher(String speciality, String degree, boolean isFullTime, 
            int hoursWorked, String name, int age, String gender, String email, 
            String address) {
        super(name, age, gender, email, address);
        this.speciality = speciality;
        this.degree = degree;
        this.isFullTime = isFullTime;
        this.hoursWorked = hoursWorked;
    }
    
    public Teacher(Teacher teacher) {
        super(teacher.getName(), teacher.getAge(), teacher.getGender(), 
                teacher.getEmail(), teacher.getAddress());
        this.speciality = teacher.speciality;
        this.degree = teacher.degree;
        this.isFullTime = teacher.isFullTime;
        this.hoursWorked = teacher.hoursWorked;
    }

    @Override
    public void personCategory() {
        System.out.println("This person is a teacher");
    }
    
    @Override
    public double computePayRoll() {
        double payRoll = 0;
        double degreeRate = 0;
        
        switch (degree.toLowerCase()) {
            case "phd":
                degreeRate = 112;
                break;
            case "master":
                degreeRate = 82;
                break;
            case "bachelor":
                degreeRate = 42;
                break;
            default:
                System.out.println("Invalid degree");
        }
        
        if (isFullTime == true)
            payRoll = 32 * degreeRate * 2 * 0.85;
        
        if (isFullTime == false && hoursWorked >= 0)
            payRoll = hoursWorked * degreeRate * 2 * 0.76;
        
        if (isFullTime == false && hoursWorked < 0)
            System.out.println("Hours worked cannot be smaller than 0 hours");
        
        return payRoll;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        if (this.isFullTime != other.isFullTime) {
            return false;
        }
        if (this.hoursWorked != other.hoursWorked) {
            return false;
        }
        if (!Objects.equals(this.speciality, other.speciality)) {
            return false;
        }
        return Objects.equals(this.degree, other.degree);
    }

    @Override
    public String toString() {
        return "Teacher["+ super.toString().substring(6) + "speciality=" + 
                speciality + ", degree=" + degree + ", isFullTime=" + isFullTime 
                + ", hoursWorked=" + hoursWorked + ']';
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean isIsFullTime() {
        return isFullTime;
    }

    public void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
