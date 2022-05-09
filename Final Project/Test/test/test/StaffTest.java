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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maxym
 */
public class StaffTest {
    
    public StaffTest() {
    }

    /**
     * Test of computePayRoll method, of class Staff.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("computePayRoll");
        Staff instance = new Staff("Janitor", 40, "Jhonny", 58, "Male",         //Tests for acceptable values
                "Jhonny@gmail.com", "2357 MacDonald Street");
        double expResult = 1920.0;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputePayRoll2() {
        System.out.println("computePayRoll");
        Staff instance = new Staff("Janitor", 32, "Jhonny", 58, "Male",         //Tests for acceptable values
                "Jhonny@gmail.com", "2357 MacDonald Street");
        double expResult = 1536.0;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputePayRoll3() {
        System.out.println("computePayRoll");
        Staff instance = new Staff("Janitor", 41, "Jhonny", 58, "Male",         //Tests for values over 40
                "Jhonny@gmail.com", "2357 MacDonald Street");
        double expResult = 0.0;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputePayRoll4() {
        System.out.println("computePayRoll");
        Staff instance = new Staff("Janitor", -1, "Jhonny", 58, "Male",         //Tests for negative values
                "Jhonny@gmail.com", "2357 MacDonald Street");
        double expResult = 0.0;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
    }
}
