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
public class Staff extends Person implements PayRoll {
    private String duty;
    private int workload;

    public Staff() {
        super("", 0, "", "", "");
        this.duty = "";
        this.workload = 0;
    }
    
    public Staff(String duty, int workload, String name, int age, String gender, 
            String email, String address) {
        super(name, age, gender, email, address);
        this.duty = duty;
        this.workload = workload;
    }
    
    public Staff(Staff staff) {
        super(staff.getName(), staff.getAge(), staff.getGender(), 
                staff.getEmail(), staff.getAddress());
        this.duty = staff.duty;
        this.workload = staff.workload;
    }

    @Override
    public void personCategory() {
        System.out.println("This person is a staff member");
    }
    
    @Override
    public double computePayRoll() {
        if (workload > 40)
            System.out.println("Workload cannot exceed 40 hours");
        
        return workload * 32 * 2 * 0.75;
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
        final Staff other = (Staff) obj;
        if (this.workload != other.workload) {
            return false;
        }
        return Objects.equals(this.duty, other.duty);
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString().substring(6) + "duty=" + duty + 
                ", workload=" + workload + ']';
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
