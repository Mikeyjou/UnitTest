/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MikeyJou
 */
public class CalculatorTest {
    
    public Calculator calculator;
    
    public CalculatorTest() {
        calculator = new Calculator();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //測試加法一
    @Test
    public void testAdd_1() {
        int a = 1;
        int b = 2;
        int result = 3;
        assertEquals(result, calculator.Add(a, b));
    }

    //測試加法二
    @Test
    public void testAdd_2() {
        int a = 3;
        int b = -2;
        int result = 1;
        assertEquals(result, calculator.Add(a, b));
    }

    //測試減法
    @Test
    public void testSub() {
        int a = 3;
        int b = 2;
        int result = 1;
        assertEquals(result, calculator.Sub(a, b));
    }
}
