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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Maxym Galenko
 */
public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Math", "PhD", true, 40, "Max", 18, "Male", "Max@gmail.com", "4690 av. Lapalme");
        Teacher t2 = new Teacher("History", "Master", false, 34, "Bob", 26, "Male", "Bob@gmail.com", "4378 av. Plamondon");
        
        Staff s1 = new Staff("Janitor", 40, "Jhonny", 58, "Male", "Jhonny@gmail.com", "2357 MacDonald Street");
        
        ArrayList<Teacher> ts = new ArrayList<>();
        
        ArrayList<Staff> ss = new ArrayList<>();
        
        ts.add(t1);
        ts.add(t2);
        
        ss.add(s1);
        
        File file = new File("college.txt");
        try {
            if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
        } catch (IOException e) {
        System.out.println("An error occurred.");
        }
        
        try (FileWriter fw = new FileWriter(file)) {
            for (Teacher each : ts) {
                fw.write(each.toString() + "\n");
            }
            
            for (Staff each : ss) {
                fw.write(each.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
    }
}
